package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1261 {

    static int N, M;
    static int[][] maze;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            String room = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = room.charAt(j) - '0';
            }
        }

        System.out.println(bfs());
        br.close();
    }

    static int bfs() {
        Deque<int[]> deque = new ArrayDeque<>();
        boolean[][] visited = new boolean[N][M];

        deque.addFirst(new int[]{0, 0, 0});
        visited[0][0] = true;

        while (!deque.isEmpty()) {
            int[] cur = deque.pollFirst();
            int x = cur[0];
            int y = cur[1];
            int cnt = cur[2];

            if (x == N - 1 && y == M - 1) return cnt;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    if (maze[nx][ny] == 0) {
                        deque.addFirst(new int[]{nx, ny, cnt});
                    } else {
                        deque.addLast(new int[]{nx, ny, cnt + 1});
                    }
                }
            }
        }
        return 0;
    }
}
