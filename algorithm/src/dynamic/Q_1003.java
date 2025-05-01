package dynamic;

import java.util.Scanner;

public class Q_1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        int[] zero = new int[41];
        int[] one = new int[41];
        zero[0] = 1; zero[1] = 0;
        one[0] = 0; one [1] = 1;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = 2; j <= n;  j++) {
                zero[j] = zero[j - 1] + zero[j - 2];
                one[j] = one[j - 1] + one[j - 2];
            }
            System.out.println(zero[n] + " " + one[n]);
        }
    }
}
