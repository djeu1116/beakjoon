package graph;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q_1922 {
    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            arr[i] = i;
        }

        int[][] networks = new int[M][3];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            networks[i][0] = Integer.parseInt(st.nextToken());
            networks[i][1] = Integer.parseInt(st.nextToken());
            networks[i][2] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(networks, Comparator.comparing(o -> o[2]));

        int result = 0;
        for (int[] network : networks) {
            if (union(network[0], network[1])) {
                result += network[2];
            }
        }
        bw.write(result + "\n");
        bw.flush();
        br.close();
        bw.close();
    }

    static boolean union(int from, int to) {
        int a = find(from);
        int b = find(to);
        if (a != b) {
            arr[a] = b;

            return true;
        }

        return false;
    }

    static int find(int a) {
        if (a == arr[a]) return a;
        return arr[a] = find(arr[a]);

    }
}
