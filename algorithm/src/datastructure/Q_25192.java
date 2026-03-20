package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        int result = 0;

        for (int i = 0; i < N;  i++) {
            String chat = br.readLine();
            if (chat.equals("ENTER")) {
                result += set.size();
                set.clear();
            } else {
                set.add(chat);
            }
        }
        result += set.size();
        System.out.println(result);
        br.close();
    }
}
