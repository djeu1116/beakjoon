package grid;

import java.util.Scanner;

public class Q_1817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = scanner.nextInt();
        }

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int result = 1;
        int temp = 0;

        for (int i : arr) {
            temp += i;
            if (temp > m) {
                result++;
                temp = i;
            }
        }
        System.out.println(result);
    }
}
