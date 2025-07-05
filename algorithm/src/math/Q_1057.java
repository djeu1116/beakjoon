package math;

import java.util.Scanner;

public class Q_1057 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int kim =  sc.nextInt();
        int lim = sc.nextInt();
        int result = 1;

        kim = (kim + 1) / 2;
        lim = (lim + 1) / 2;

        while (kim != lim) {
            kim =  (kim + 1) / 2;
            lim = (lim + 1) / 2;
            result++;
        }

        System.out.println(result);
    }
}
