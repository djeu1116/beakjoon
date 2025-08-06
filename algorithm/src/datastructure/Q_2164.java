package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> cards = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            cards.offer(i); // offer() : add()와 달리 큐가 꽉 찬 경우 false 반환
        }

        while (cards.size() != 1) {
            cards.poll(); // poll() : remove()와 달리 큐가 비어 있을 경우 null 반환
            cards.offer(cards.poll());
        }
        System.out.println(cards.poll());
    }
}
