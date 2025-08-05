package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q_12852 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp =  new int[n + 1];
        int[] path = new int[n + 1];

        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            path[i] = i - 1;

            if (i % 2 == 0) {
                if (dp[i] > dp[i / 2]) {
                    dp[i] = Math.min(dp[i], dp[i / 2] + 1);
                    path[i] = i / 2;
                }
            }
            if (i % 3 == 0) {
                if (dp[i] > dp[i / 3]) {
                    dp[i] = Math.min(dp[i], dp[i / 3] + 1);
                    path[i] = i / 3;
                }
            }
        }
        System.out.println(dp[n]);
        List<Integer> result = new ArrayList<>();
        int current = n;
        while(current != 0) {
            result.add(current);
            current = path[current];
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
