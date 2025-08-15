package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 7 3

        int n = Integer.parseInt(st.nextToken()); // 7
        int k = Integer.parseInt(st.nextToken()); // 3

        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            q.offer(i);
        }

        int temp_cnt = 0;
        int[] result = new int[n];

        while (!q.isEmpty()){
            for (int i = 0; i < k; i++) {
                if (i != k - 1) {
                    q.offer(q.poll());
                } else {
                    result[temp_cnt++] = q.poll();
                }
            }
        }
        System.out.print("<");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(result[i]);
            } else {
                System.out.print(result[i] + ", ");
            }

        }
        System.out.println(">");

    }
}
