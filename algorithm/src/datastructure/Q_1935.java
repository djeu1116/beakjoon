package datastructure;

import java.io.*;
import java.util.ArrayDeque;

public class Q_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        ArrayDeque<Double> deque = new ArrayDeque<>();
        double[] value = new double[N];
        for (int i = 0; i < N; i++) {
            value[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            double result = 0;

            if (chr - 65 >= 0 && chr - 65 <= 26) {
                deque.push(value[chr - 65]);
            } else {
                double v1 = deque.pop();
                double v2 = deque.pop();
                if (chr == '+') {
                    result = v2 + v1;
                    deque.push(result);
                } else if (chr == '-') {
                    result = v2 - v1;
                    deque.push(result);
                } else if (chr == '*') {
                    result = v2 * v1;
                    deque.push(result);
                } else if (chr == '/') {
                    result = v2 / v1;
                    deque.push(result);
                }
            }

        }

        bw.write(String.format("%.2f", deque.pollLast()));
        bw.flush();
        br.close();

    }
}
