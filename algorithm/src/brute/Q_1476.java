package brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken()); // 지구
        int S = Integer.parseInt(st.nextToken()); // 태양
        int M = Integer.parseInt(st.nextToken()); // 달
        int result = 1;

        int e = 1;
        int s = 1;
        int m = 1;

        while (true) {
            if (e == E && s == S && m == M) break;
            if (e == 15) e = 1;
            else e++;
            if (s == 28) s = 1;
            else s++;
            if (m == 19) m = 1;
            else m++;
            result ++;
        }

        System.out.println(result);
        br.close();

    }
}
