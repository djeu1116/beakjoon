package brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_3085 {
    static char[][] map;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        int result = Integer.MIN_VALUE;


        for (int i = 0; i < N; i++) {
            String candy = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = candy.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (map[i][j - 1] != map[i][j]) {
                    char temp = map[i][j - 1];
                    map[i][j-1] = map[i][j];
                    map[i][j] = temp;
                    int max = getMax();
                    if (max > result) {
                        result = max;
                    }
                    map[i][j] = map[i][j - 1];
                    map[i][j - 1] = temp;
                }
            }
        }

        for (int j = 0; j < N; j++) {
            for (int i = 1; i < N;  i++) {
                if (map[i - 1][j] != map[i][j]) {
                    char temp = map[i - 1][j];
                    map[i - 1][j] = map[i][j];
                    map[i][j] = temp;
                    int max = getMax();
                    if (max > result) {
                        result = max;
                    }
                    map[i][j] = map[i - 1][j];
                    map[i - 1][j] = temp;
                }
            }
        }

        System.out.println(result);
        br.close();
    }

    static int getMax() {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            char prev = map[i][0];
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (prev == map[i][j]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count > max) {
                    max = count;
                }
                prev = map[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            char prev = map[0][i];
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (prev == map[j][i]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count > max) {
                    max = count;
                }

                prev = map[j][i];
            }

        }
        return max;

    }
}
