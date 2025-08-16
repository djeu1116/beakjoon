package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n =  Integer.parseInt(st.nextToken());
        int m =  Integer.parseInt(st.nextToken());
        List<String> notH = new ArrayList<>();
        List<String> notS = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++){ // 3
            notH.add(br.readLine());
        }

        for (int i = 0; i < m; i++){ // 4
            notS.add(br.readLine());
        }

        Collections.sort(notS);
        Collections.sort(notH);

        // 투 포인트 포인터를 사용해서 시간 단축 O((N+M)log(N+M))
        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            int compare = notH.get(p1).compareTo(notS.get(p2));
            if (compare == 0) {
                result.add(notH.get(p1));
                p1++;
                p2++;
            } else if (compare < 0) {
                p1 ++;
            } else {
                p2 ++;
            }
        }

        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
