package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_1009 {
    public static void main(String[] args) {

        List<Integer> lastNum = new ArrayList<>();
        int result;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int temp = 1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            lastNum.clear();

            for (int j = 1; j <= 4; j++) {
                temp = (int) Math.pow(a, j) % 10;
                if (lastNum.contains(temp)) break;
                else lastNum.add(temp);
            }
            int index = b % lastNum.size() - 1;
            if (index < 0) index += lastNum.size();

            if (lastNum.get(index) == 0) result = 10;
            else result = lastNum.get(index);
            System.out.println(result);
        }
        sc.close();
    }
}
