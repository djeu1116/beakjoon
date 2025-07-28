package dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class Q_11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] count = new int[n];
        Arrays.fill(count, 1);

        int result = 0;

        if (n > 0) {
            result = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    count[i] = Math.max(count[i], count[j] + 1);
                }
            }
            result = Math.max(result, count[i]);
        }
        System.out.println(result);
        sc.close();

    }
}
