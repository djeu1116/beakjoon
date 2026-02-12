import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int[] command : commands) {
            int[] temp = {};
            temp = Arrays.copyOfRange(array, command[0] - 1, command[1] - 1);
            Arrays.sort(temp);
            answer.add(temp[command[2]]);
        }
        return answer;
    }
}