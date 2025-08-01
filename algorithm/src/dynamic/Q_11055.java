package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        int[] a = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(numbers[i]);
        }

        dp[0] = a[0];
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = a[i];
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + a[i]);
                }
            }
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
        br.close();
    }
}
