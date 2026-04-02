import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];
        Arrays.fill(students, 1);
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int l : lost) {
            students[l - 1] -= 1;
        }

        for (int r : reserve) {
            students[r - 1] += 1;
        }

        for (int i = 0; i < n; i++) {
            if (students[i] == 0) {
                if (i - 1 >= 0 && students[i - 1] == 2) {
                    students[i - 1] -= 1;
                    students[i] += 1;
                } else if (i + 1 < n && students[i + 1] == 2) {
                    students[i + 1] -= 1;
                    students[i] += 1;
                }
            }

            if (students[i] > 0) {
                answer ++;
            }
        }

        return answer;
    }
}