package implementation;

import java.util.Scanner;

public class Q_1138 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            int count = 0;

            for (int j = 0; j < n; j++) { // 2 1 1 0
                if (height[j] == 0) {
                    if (count == temp) {
                        height[j] = i + 1;
                        break;
                    }
                    count++;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(height[k] + " ");
        }
    }
}
