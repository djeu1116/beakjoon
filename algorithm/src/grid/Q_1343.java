package grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1343 {

    public static String polinomio(String str) {
        while (str.contains("XXXX")) {
            str = str.replace("XXXX", "AAAA");
        }
        while (str.contains("XX")) {
            str = str.replace("XX", "BB");
        }
        if (str.contains("X")) {
            return String.valueOf(-1);
        } else return str;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();
        System.out.println(polinomio(board));

        br.close();
    }
}
