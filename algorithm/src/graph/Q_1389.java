package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1389 {

    static int N, M, a, b;
    static boolean[] visit;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        int result = Integer.MAX_VALUE;
        int who = 0;

        for (int i = 1; i <= N; i++) {
            int temp = bfs(i);
            if (temp < result) {
                result = temp;
                who = i;
            }
        }

        System.out.println(who);
        br.close();

    }

    static int bfs(int start) {
        Queue<int[]> q = new LinkedList<>();
        visit = new boolean[N + 1];
        visit[start] = true;
        q.add(new int[] {start, 0});

        int sum = 0;
        while (!q.isEmpty()) {
            int[] p = q.poll(); // 1 3
            for (int i = 0; i < arr[p[0]].size(); i++) {
                int next = arr[p[0]].get(i);
                if (!visit[next]) {
                    visit[next] = true;
                    q.add(new int[] {next, p[1] + 1});
                    sum += p[1] + 1;
                }
            }
        }

        return sum;

    }
}
