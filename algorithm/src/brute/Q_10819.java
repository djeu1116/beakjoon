package brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10819 {
    static int[] array;
    static int N, result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        permutation(array, 0);
        System.out.println(result);
        br.close();
    }

    static void permutation(int[] arr, int depth) {
        if (depth == N) {
            int sum = 0;
            for (int i = 0; i < N - 1; i++) {
                sum += Math.abs(arr[i] - arr[i + 1]);
            }
            result = Math.max(result, sum);
            return;
        }

        for (int i = depth; i < N; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}