package math;

import java.util.Scanner;

public class Q_1712 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;

        if (b >= c) {
            result = -1;
            System.out.println(result);
        } else {
            result = (a / (c - b)) + 1;
            System.out.println(result);
        }
    }
}
