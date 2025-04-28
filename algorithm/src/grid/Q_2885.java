package grid;

import java.util.Scanner;

public class Q_2885 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt(); // 6
        int result = 1;
        int d = 0;
        int count = 0;
        int square = 0;
        while (result < k) {
            result *= 2;
            square +=1;
        }
        int temp = result;
        if (temp == k) {

        } else {
            for (int i = 0; i < square; i++) { // 0,1,2
                temp /= 2;
                d += temp;
                count ++;
                if (d == k) {
                    break;
                } else if (d > k) {
                    d -=temp;
                }
            }
        }
        System.out.println(result + " " + count);
    }
}
