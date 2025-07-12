package implementation;

import java.util.Scanner;

//dynamic programming
public class Q_2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i< n+1 ;i++){
            for(int j=1; j< m+1 ;j++){
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1] + arr[i - 1][j - 1];
            }
        }

        int k = sc.nextInt();
        for (int cnt = 0; cnt < k; cnt++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(dp[x][y] - dp[x][j - 1] - dp[i - 1][y] + dp[i - 1][j - 1]);
        }
    }
}
