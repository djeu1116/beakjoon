package datastructure;

import java.io.*;
import java.util.*;

public class Q_2346 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1 ");
        int input = arr[0];

        for (int i = 1; i < n; i++) {
            deque.add(new int[]{(i + 1), arr[i]});
        }

        while (!deque.isEmpty()) {
            if (input > 0) {
                for (int i = 1; i < input; i++) {
                    deque.add(deque.poll());
                }

                int[] nxt = deque.pollFirst();
                input = nxt[1];
                sb.append(nxt[0] + " ");

            } else {
                for (int i = 1; i <-input; i++) {
                    deque.addFirst(deque.pollLast());
                }

                int[] nxt = deque.pollLast();
                input = nxt[1];
                sb.append(nxt[0] + " ");
            }
        }
        System.out.print(sb);
    }
}
