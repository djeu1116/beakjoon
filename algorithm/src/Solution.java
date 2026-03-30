class Solution {
    static boolean[] visited;
    public int solution(int n, int[][] computers) {

        int answer = 0;

        visited = new boolean[n];
        for (int i = 0; i < n; i++) {  // 3
            if (!visited[i]) {
                answer ++;
                dfs(i, computers);
            }
        }
        return answer;
    }

    public void dfs(int n, int[][] computers) {
        visited[n] = true;
        for (int i = 0; i < computers.length; i++) {
            if (computers[n][i] == 1 && !visited[i]) {
                dfs(i, computers);
            }
        }
    }

}