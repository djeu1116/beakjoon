package grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2828 {
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());

        int start = 1;
        int end = m;
        int result = 0;

        for (int i = 0; i < j; i++) {
            int apple = Integer.parseInt(br.readLine());
            if (start > apple) { //
                result += start - apple; // 2
                end -= start - apple; //
                start = apple; //
            } else if (end < apple) { // 1 5
                result += apple - end; // 4
                start += apple - end; // 4
                end = apple; // 5
            }
        }
        System.out.println(result);
        br.close();
    }
}
