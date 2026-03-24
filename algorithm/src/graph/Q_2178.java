package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_2178 {

    static int N;
    static int M;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String stall = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = stall.charAt(j) - '0';
            }
        }

        solution(0, 0);

        System.out.println(maze[N - 1][M - 1]);
        br.close();

    }

    static void solution(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});

        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M) {
                    continue;
                }

                if (visited[nextX][nextY] || maze[nextX][nextY] == 0) {
                    continue;
                }

                queue.add(new int[] {nextX, nextY});
                maze[nextX][nextY] = maze[nowX][nowY] + 1;
                visited[nextX][nextY] = true;

            }
        }
    }
}
