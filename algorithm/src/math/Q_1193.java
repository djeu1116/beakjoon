package math;

import java.util.Scanner;

public class Q_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        int x = 1;
        int y = 1;

        while (count < n){
            if ((x + y) % 2 == 0) {
                if (x == 1) {
                    y ++;
                } else {
                    x --;
                    y ++;
                }
            } else {
                if (y == 1) {
                    x ++;
                } else {
                    y --;
                    x ++;
                }
            }
            count++;
        }
        System.out.println(x + "/" + y);
    }
}
