package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10451 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[N + 1];
            boolean[] visited = new boolean[N + 1];
            int count = 0;

            for (int j = 1; j <= N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 1; j <= N; j++) {
                if (!visited[j]) {
                    count++;
                    dfs(j, arr, visited);
                }
            }
            System.out.println(count);
        }

        br.close();
    }

    private static void dfs(int j, int[] arr, boolean[] visited) {
        if (!visited[j]) {
            visited[j] = true;
            dfs(arr[j], arr, visited);
        }
    }
}
