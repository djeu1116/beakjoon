package math;

import java.util.Scanner;

public class Q_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int pack = 1000;
        int each = 1000;
        int result = 0;

        for (int i = 0; i < m; i++) {
            int tempSix = sc.nextInt();
            int tempOne = sc.nextInt();
            if (tempSix < pack) pack = tempSix;
            if (tempOne < each) each = tempOne;
        }

        int share = n / 6;
        int remain = n % 6;
        if (pack > each * 6) {
            result += each * n;
        } else if (pack < (each * remain)) {
            result = pack * (share + 1);
        }
        else {
            result = (share * pack) +  (each * remain);
        }
        System.out.println(result);


    }
}
