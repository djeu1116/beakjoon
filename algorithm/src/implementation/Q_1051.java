package implementation;

import java.util.Scanner;

public class Q_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] rect = new int [n][m];

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                rect[i][j] = line.charAt(j) - '0';
            }
        }

        int maxSize = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int size = 1; i + size < n && j + size < m; size++) {
                    if (rect[i][j] == rect[i][j + size] &&
                            rect[i][j] == rect[i + size][j] &&
                            rect[i][j] == rect[i + size][j + size]) {
                        int area = (size + 1) * (size + 1);
                        maxSize = Math.max(maxSize, area);
                    }
                }
            }
        }
        System.out.println(maxSize);
    }
}
