package implementation;

import java.util.Scanner;

public class Q_1159 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[26];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int idx = name.charAt(0) - 'a';
            arr[idx]++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                result.append((char)(i + 'a'));
            }
        } if (result.length() == 0) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(result);
        }
    }
}
