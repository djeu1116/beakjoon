package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_16953 {

    static int A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        Queue<long[]> q = new LinkedList<>();
        q.add(new long[]{A, 1}); // 현재값 연산횟수

        int answer = -1;
        while (!q.isEmpty()) {
            long[] cur = q.poll();
            long value = cur[0];
            long count = cur[1];

            if (value == B) {
                answer = (int) count;
                break;
            }

            if (value * 2 <= B) q.add(new long[]{value * 2, count + 1});
            if (value * 10 + 1 <= B) q.add(new long[]{value * 10 + 1, count + 1});
        }

        System.out.println(answer);
        br.close();
    }
}
