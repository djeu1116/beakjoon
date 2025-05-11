package grid;

import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                result += n / 5;
                break;
            } else {
                n -=3;
                result ++;
            }
        }
        if (n < 0 ) {
            result = -1;
        }
        System.out.println(result);
    }
}
