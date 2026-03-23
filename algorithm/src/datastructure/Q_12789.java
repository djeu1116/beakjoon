package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Integer> q = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            q.offer(input);
            pq.offer(input);
        }

        String result = solution(N, q, pq) ? "Nice" : "Sad";
        System.out.println(result);
        br.close();
    }

    static boolean solution(int N, Queue<Integer> q, PriorityQueue<Integer> pq) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            int next = q.poll();
            int priority = pq.peek();
            if (next == priority) {
                pq.poll();
                while (!st.isEmpty() && !pq.isEmpty() && st.peek().equals(pq.peek())) {
                    st.pop();
                    pq.poll();
                }
            } else {
                st.push(next);
            }
        }
        return pq.isEmpty();
    }
}
