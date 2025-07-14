package implementation;

import java.util.Scanner;

public class Q_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weight = new int[n];
        int[] height  = new int[n];
        int[] result = new int[n];


        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            weight[i] = x;
            height[i] = y;
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            int temp_x =  weight[i];
            int temp_y = height[i];
            for (int j = 0; j < n; j++) {
                if (temp_x < weight[j] && temp_y < height[j]) {
                    rank ++;
                }
            }
            result[i] = rank;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
