package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int result = 0;
            Queue<int[]> queue = new LinkedList<int[]>();
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                queue.add(new int[] {j, Integer.parseInt(st.nextToken())});
            }

            while (true) {
                int[] cur = queue.poll();
                boolean check = true;

                for (int[] curQ : queue) {
                    if (curQ[1] > cur[1]) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    result++;
                    if (cur[0] == M) break;
                }
                else {
                    queue.add(cur);
                }
            }
            System.out.println(result);
        }
        br.close();
    }
}
