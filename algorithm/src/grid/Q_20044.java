package grid;

import java.util.Arrays;
import java.util.Scanner;

public class Q_20044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int team = sc.nextInt();
        int[] array =  new int[team * 2];
        for (int i = 0; i < team * 2; i ++) {
            array[i] =  sc.nextInt();
        }

        Arrays.sort(array);
        int j = team * 2 - 2;
        int result = array[0] + array[array.length - 1];
        for (int i = 1; i < team; i ++) {
            int temp = array[i] + array[j];
            if (temp < result) {
                result = temp;
            }
            j --;
        }
        System.out.println(result);
    }
}
