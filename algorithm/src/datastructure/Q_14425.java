package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<String> strings = new ArrayList<>();
        int result = 0;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        for (int i = 0; i < N; i++) {
            strings.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            if (strings.contains(br.readLine())) {
                result ++;
            }
        }

        System.out.println(result);
        br.close();

    }
}
