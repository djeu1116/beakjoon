package grid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1946 {
    static int interview;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 1;
            int[][] people = new int[n][2];
            for (int j = 0; j < n; j++) {
                st = new  StringTokenizer(br.readLine());
                people[j][0] = Integer.parseInt(st.nextToken());
                people[j][1] = Integer.parseInt(st.nextToken());
            }

            // 서류 순위로 정렬
            Arrays.sort(people, (o1, o2) -> o1[0] - o2[0]);
            interview = people[0][1];

            for (int j = 1; j < n; j++) {
                if (people[j][1] < interview) {
                    count++;
                    interview = people[j][1];
                }
            }
            System.out.println(count);
        }
        br.close();
    }
}
