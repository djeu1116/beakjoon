package grid;

import java.util.Arrays;
import java.util.Scanner;

public class Q_1246 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 5
        int m = in.nextInt(); // 4

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int revenue = 0;
        int price = 0;
        int temp = 0;

        for (int i = 0; i < m; i++) {
            int count;
            if (n < m - i) {
                count = n;
            } else {
                count = m - i;
            }
            temp = arr[i] * count;

            if (temp > revenue) {
                revenue = temp;
                price = arr[i];
            }
        }

        System.out.println(price + " " + revenue);
    }
}
