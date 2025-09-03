package grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        long n = 1;

        while (s > 0) {
            if (s - n <= n) {
                System.out.println(n);
                return;
            } else {
                s -= n;
                n++;
            }
        }
    }
}
