package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++ ){
            String str = br.readLine();
            if (str.length() % 2 == 1) continue;
            Stack<Character> word = new Stack<Character>();
            word.push(str.charAt(0));
            for (int j = 1; j < str.length(); j++){
                if (word.size() > 0 && word.peek() == str.charAt(j)){
                    word.pop();
                } else {
                    word.push(str.charAt(j));
                }
            }
            if (word.isEmpty()) count++;
        }
        System.out.println(count);
    }
}
