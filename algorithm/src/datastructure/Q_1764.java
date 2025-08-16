package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n =  Integer.parseInt(st.nextToken());
        int m =  Integer.parseInt(st.nextToken());
        List<String> notH = new ArrayList<String>();
        List<String> notS = new ArrayList<String>();
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < n; i++){ // 3
            notH.add(br.readLine());
        }

        for (int i = 0; i < m; i++){ // 4
            notS.add(br.readLine());
        }

        Collections.sort(notS);
        Collections.sort(notH);

        for (int i = 0; i < notH.size(); i++){
            String temp = notH.get(0);
            notH.remove(0);
            for (int j = 0; j < notS.size(); j++) {
                if (temp.equals(notS.get(j))){
                    result.add(temp);
                    notS.remove(j);
                    break;
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
