package grid;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q_1417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dasom = scanner.nextInt();
        int result = 0;

        if (n != 1) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 1; i < n; i++) {
                pq.add(scanner.nextInt());
            }
            while (pq.peek() >= dasom) {
                int temp = pq.poll();
                temp --;
                dasom ++;
                result ++;
                pq.add(temp);
            }
        }
        System.out.println(result);
    }
}
