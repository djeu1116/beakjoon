package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1012 {
    static int N, M, K;
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            int count = 0;
            field = new int[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (field[j][k] == 1 && !visited[j][k]) {
                        solution(j, k);
                        count ++;
                    }
                }
            }
            System.out.println(count);
        }

        br.close();
    }

    static void solution(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            x = curr[0];
            y = curr[1];

            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];
                if (cx >= 0 && cx < N && cy >= 0 && cy < M) {
                    if (!visited[cx][cy] && field[cx][cy] == 1) {
                        q.add(new int[] {cx, cy});
                        visited[cx][cy] = true;
                    }
                }
            }
        }
    }

}
