package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.contains("push")) {
                int value = Integer.parseInt(st.nextToken());
                q.add(value);
            } else if (command.contains("pop")) {
                if (q.isEmpty()) System.out.println(-1);
                else System.out.println(q.poll());
            } else if (command.contains("size")) {
                System.out.println(q.size());
            } else if (command.contains("empty")) {
                if (q.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (command.contains("front")) {
                if (q.isEmpty()) System.out.println(-1);
                else System.out.println(q.peek());
            } else if (command.contains("back")) {
                if (q.isEmpty()) System.out.println(-1);
                else System.out.println(q.peekLast());
            }
        }

    }
}
