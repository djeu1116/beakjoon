package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1976 {
    static int N, M;
    static int[] parent;

    static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            if (a > b) parent[a] = b;
            else parent[b] = a;
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++) {
                int city = Integer.parseInt(st.nextToken());
                if (city == 1) {
                    union(i, j);
                }

            }

        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        boolean isPossible = true;
        for (int i = 1; i < M; i++) {
            int plan = Integer.parseInt(st.nextToken());
            if (find(start) == find(plan)) continue;
            isPossible = false;
        }

        System.out.println(isPossible ? "YES" : "NO");
        br.close();

    }
}
