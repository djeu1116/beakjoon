package grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l =  Integer.parseInt(st.nextToken());
        int[] pipe = new int[n];
        int count = 1;

        st =  new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pipe[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(pipe);

        int c = pipe[0] + (l - 1); // 1 + 4
        for (int i = 1; i < n; i++) {
            if (pipe[i] <= c) { //
                continue;
            } else {
                c = pipe[i] + (l - 1);
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
