package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m  = Integer.parseInt(st.nextToken());

        Map<String, Integer> dic = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() >= m) {
                dic.put(word, dic.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(dic.keySet());

        // Comparator 인터페이스 구현을 위해 compare 메서드를 반드시 오버라이드
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 등장횟수가 다르다면 더 많이 내림차순으로 정렬
                if (Integer.compare(dic.get(o1), dic.get(o2)) != 0) {
                    return Integer.compare(dic.get(o2), dic.get(o1));
                }
                // 등장횟수가 같다면 단어의 길이가 더 긴 것을 앞으로 배치
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                // 등장횟수가 같고 길이가 똑같다면 사전순으로 정렬
                return o1.compareTo(o2);
            }

        });

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word + "\n");
        }
        System.out.println(sb);
    }
}
