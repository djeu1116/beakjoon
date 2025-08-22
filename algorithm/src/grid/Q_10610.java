package grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String n = br.readLine();

        char[] arr = n.toCharArray();
        Arrays.sort(arr);

        int result = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            int num = arr[i] - '0';
            result += num;
            sb.append(num);
        }

        if (result % 3 != 0 || arr[0] != '0') {
            System.out.println(-1);
            return;
        }

        System.out.println(sb);
        br.close();
    }
}
