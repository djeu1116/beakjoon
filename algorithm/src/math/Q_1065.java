package math;

import java.util.Scanner;

public class Q_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,result;
        n = sc.nextInt();
        result = 99;
        if (n < 100) {
            result = n;
        } else if (n == 1000) {
            result = 144;
        } else {
            for (int i = 100; i <= n; i++) {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;
                if ((a - b) == (b - c)) {
                    result ++;
                }
            }
        }
        System.out.println(result);
    }
}
