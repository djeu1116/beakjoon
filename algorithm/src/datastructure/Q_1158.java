package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        int judge = 1;
        while (!q.isEmpty()) {
            if (judge % K == 0) {
                if (q.size() == 1) {
                    sb.append(q.poll());
                } else {
                    sb.append(q.poll());
                    sb.append(", ");
                }
            } else {
                q.add(q.poll());
            }
            judge ++;
        }

        sb.append(">");

        System.out.println(sb.toString());
        br.close();
    }
}