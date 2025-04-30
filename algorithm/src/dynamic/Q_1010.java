package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1010 { // 조합의 성질을 이용해 풀이

    private static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            System.out.println(combination(m, n));
        }
    }
    static int combination(int n, int m) { // 1 5
        if (n == m || m == 0) {
            return dp[n][m] = 1;

        } else if (dp[n][m] > 0) { // 0이 아니라면 이미 계산이 끝난 것
            return dp[n][m];
        }

        return dp[n][m] = combination(n - 1, m - 1) + combination(n - 1, m);
    }
}
