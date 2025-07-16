package implementation;

import java.util.Scanner;

public class Q_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] circle = new int[n];
        for (int i = 0; i < n; i++) {
            circle[i] = i + 1;
        }

        int[] result = new int[n];
        int temp = -1;
        int resultIndex = 0;

        for (int i = 0; i < n; i++) {
            int step = 0;
            while (step < k) {
                temp = (temp + 1) % n;
                if (circle[temp] != -1) {
                    step++;
                }
            }
            result[resultIndex++] = circle[temp];
            circle[temp] = -1;
        }

        System.out.print("<");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print(result[n - 1] + ">");

        sc.close();
    }
}
