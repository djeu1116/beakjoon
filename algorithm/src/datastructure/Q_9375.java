package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Map<String, Integer> clothes = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind  = st.nextToken();
                clothes.put(kind, clothes.getOrDefault(kind, 0) + 1);
            }

            int count = 1;
            for (int val: clothes.values())
                count *= val + 1;
            System.out.println(count -1);
        }
    }
}
