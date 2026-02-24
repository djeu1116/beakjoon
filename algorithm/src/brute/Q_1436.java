package brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 666;

        while (true) {
            if (Integer.toString(result).contains("666")) {
                n--;
            }
            if (n == 0) {
                break;
            }
            result ++;
        }
        System.out.println(result);
        br.close();
    }
}
