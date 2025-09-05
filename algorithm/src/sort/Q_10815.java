package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] card = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(card);

        int m = Integer.parseInt(br.readLine());
        st =  new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++){
            int target = Integer.parseInt(st.nextToken());

            // 이진탐색 이용
            if (Arrays.binarySearch(card, target) >= 0){
                sb.append(1 + " ");
            } else {
                sb.append(0 + " ");

            }
        }
        System.out.println(sb.toString());
    }
}
