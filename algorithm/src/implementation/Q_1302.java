package implementation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q_1302 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> books = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String title = sc.next();
            books.put(title, books.getOrDefault(title, 0) + 1);
        }

        int max = 0;
        String bestSeller = "";

        for (Map.Entry<String, Integer> entry : books.entrySet()) { // key, value가 모두 필요한 경우 entrySet을 이용
            String currentTitle = entry.getKey();
            int currentValue = entry.getValue();

            if (currentValue > max) {
                max = currentValue;
                bestSeller = currentTitle;
            } else if (currentValue == max) {
                if (currentTitle.compareTo(bestSeller) < 0) {
                    bestSeller = currentTitle;
                }
            }
        }
        System.out.println(bestSeller);
        sc.close();
    }
}

