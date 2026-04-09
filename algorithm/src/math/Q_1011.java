package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {

            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int cnt = 0;

            int distance = y - x;
            int max = (int)Math.sqrt(distance);

            if (max == Math.sqrt(distance)) {
                System.out.println(2 * max - 1);
            } else if (distance <= max * max + max) {
                System.out.println(2 * max);
            } else {
                System.out.println(2 * max + 1);
            }
        }
    }
}
