package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q_1269 {
    static Set<Integer> setA = new HashSet<>();
    static Set<Integer> setB = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int element = Integer.parseInt(st.nextToken());
            setA.add(element);
        }

        st = new  StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int element = Integer.parseInt(st.nextToken());
            setB.add(element);
        }

        for (int num : setA) {
            if (!setB.contains(num)) {
                result +=1;
            }
        }
        for (int num : setB) {
            if (!setA.contains(num)) {
                result +=1;
            }
        }

        System.out.println(result);
        br.close();

    }
}
