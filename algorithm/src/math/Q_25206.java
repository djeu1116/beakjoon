package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double avg = 0;
        double total = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());

            String subject = st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String rank = st.nextToken();
            if (rank.equals("P")) {
                continue;

            }
            total += grade;

            switch (rank) {
                case "A+":
                    avg += grade * 4.5;
                    break;
                case "A0":
                    avg += grade * 4.0;
                    break;
                case "B+":
                    avg += grade * 3.5;
                    break;
                case "B0":
                    avg += grade * 3.0;
                    break;
                case "C+":
                    avg += grade * 2.5;
                    break;
                case "C0":
                    avg += grade * 2.0;
                    break;
                case "D+":
                    avg += grade * 1.5;
                    break;
                case "D0":
                    avg += grade * 1.0;
                    break;
                case "F":
                    avg += 0;
                    break;
            }
        }

        avg = avg / total;
        System.out.printf("%.6f%n", avg);
        br.close();
     }
}
