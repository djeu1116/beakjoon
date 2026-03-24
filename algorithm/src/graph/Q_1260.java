package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1260 {
    static int[][] Edge;
    static boolean[] Visited;
    static Queue<Integer> queue = new LinkedList<>();

    static int N;
    static int M;
    static int V;
    static int count;

    public static void bfs(int start) {
        queue.offer(start);
        Visited[start] = true;
        System.out.print(start + " ");

        while (!queue.isEmpty()) {
            start = queue.poll();

            for (int i = 1; i <= N; i++) {
                if (Edge[start][i] == 1 && !Visited[i]) {
                    queue.offer(i);
                    Visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void dfs(int start) {
        Visited[start] = true;
        System.out.print(start + " ");

        if (count == N) {
            return;
        }
        count ++;

        for (int i = 1; i <= N; i++) {
            if (Edge[start][i] == 1 && !Visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        Edge = new int[1001][1001];
        Visited = new boolean[1001];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            Edge[x][y] = Edge[y][x] = 1;
        }

        dfs(V);
        System.out.println();

        Visited = new boolean[1001];
        bfs(V);
    }
}
