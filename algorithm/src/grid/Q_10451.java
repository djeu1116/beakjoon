/**
  * 풀이방법 블로그 참고함
**/
package grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10451 {
    static int[] map;
    static boolean[] check;
    static int cycle;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            map = new int[N + 1];
            cycle = 0;

            st =  new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++) {
                map[j] = Integer.parseInt(st.nextToken());
            }

            check = new boolean[N + 1];
            for (int j = 1; j < N + 1; j++) {
                if (!check[j]) {
                    dfs(j);
                    cycle++;
                }
            }
            System.out.println(cycle);

        }
        br.close();
    }

    private static void dfs(int start) {
        check[start] = true;
        int next = map[start];

        if (!check[next]) {
            dfs(next);
        }
    }
}
