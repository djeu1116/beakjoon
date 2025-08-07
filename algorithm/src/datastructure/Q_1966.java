package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1966 {

    static LinkedList<int[]> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new  StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                // {초기 위치, 중요도}
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0;

            while (!queue.isEmpty()) {
                int[] front = queue.poll();
                boolean isMax = true;

                for (int i = 0; i < queue.size(); i++) {
                    if (front[1] < queue.get(i)[1]) {

                        queue.offer(front);
                        for (int j = 0; j < i; j++) {
                            queue.offer(queue.poll());
                        }
                        isMax = false;
                        break;
                    }
                }

                if (isMax == false) {
                    continue;
                }

                cnt ++;
                if (front[0] == m) {
                    break;
                }
            }

            sb.append(cnt).append("\n");

        }

        System.out.println(sb);

    }
}
