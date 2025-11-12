package grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Q_1141 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });

        HashSet<String> set = new HashSet<>();
        for (String word1 : words) {
            if (set.isEmpty()) {
                set.add(word1);
                continue;
            }

            boolean available = true;
            for (String word2 : set) {
                if (word2.indexOf(word1) == 0) {
                    available = false;
                    break;
                }
            }
            if (available) {
                set.add(word1);
            }
        }
        System.out.println(set.size());
    }
}