package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1629 { // 지수 법칙, 모듈러 성질

    static long C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(pow(A, B));
        br.close();
    }

    static long pow(long A, long exponent) { // 밑 지수
        if (exponent == 1) return A % C;

        Long temp = pow(A, exponent / 2);

        if (exponent % 2 == 1) {
            return (temp * temp % C) * A % C;
        }

        return temp * temp % C;

    }

}
