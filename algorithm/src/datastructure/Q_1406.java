package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Q_1406 { // 문자열 시간 초과 -> LinkedList + ListIterator 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String N = br.readLine();
        int M = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();
        for (char c : N.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> iter = list.listIterator(list.size());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String type = st.nextToken();

            if (type.equals("L")) {
                if (iter.hasPrevious()) iter.previous();

            } else if (type.equals("D")) {
                if (iter.hasNext()) iter.next();

            } else if (type.equals("B")) {
                if (iter.hasPrevious()) {
                    iter.previous();
                    iter.remove();
                }

            } else if (type.equals("P")) {
                iter.add(st.nextToken().charAt(0));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }

        System.out.println(sb);
        br.close();
    }
}
