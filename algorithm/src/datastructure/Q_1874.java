package datastructure;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Stack;

public class Q_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int now = 1;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int sequence = Integer.parseInt(br.readLine());

            while (now <= sequence) {
                stack.push(now++);
                sb.append("+\n");
            }

            if (stack.peek() == sequence) {
                stack.pop();
                sb.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
        br.close();
    }
}
