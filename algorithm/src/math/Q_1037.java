package math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> measure = new ArrayList<Integer>();
        int result;

        int a =  sc.nextInt();
        for (int i = 0; i < a;  i++){
            measure.add(sc.nextInt());
        }

        if (a == 1) {
            result = measure.get(0) * measure.get(0);
        } else {
            Collections.sort(measure);
            result = measure.get(0) * measure.get(measure.size()-1);
        }
        System.out.println(result);
    }
}
