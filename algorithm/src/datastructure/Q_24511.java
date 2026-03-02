package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] isQueueStack = new int[N];
        int[] currentList = new int[N];
        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder answer = new StringBuilder();

        StringTokenizer input1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            isQueueStack[i] = Integer.parseInt(input1.nextToken());
        }

        StringTokenizer input2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            currentList[i] = Integer.parseInt(input2.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] insertList = new int[M];

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            insertList[i] = Integer.parseInt(st3.nextToken());
        }

        // 큐일때만
        for (int i = 0; i < N; i++) {
            if (isQueueStack[i] == 0) {
                deque.addFirst(currentList[i]);
            }
        }
        for (int i = 0; i < M; i++) {
            deque.add(insertList[i]);
            answer.append(deque.pollFirst()).append(" ");
        }

        System.out.println(answer);
        br.close();
    }
}
