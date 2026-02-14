package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String parentheses = br.readLine();
        Stack<Character> stack = new Stack<>();

        int result = 0;

        for (int i = 0; i < parentheses.length(); i++) {
            if (parentheses.charAt(i) == '(') {
                stack.push('(');
                continue;
            }
            if (parentheses.charAt(i) == ')') {
                stack.pop();

                if (parentheses.charAt(i - 1) == '(') {
                    result += stack.size();
                } else {
                    result++;
                }
            }
        }

        System.out.println(result);
        br.close();
    }
}
