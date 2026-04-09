import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerInt = new ArrayList<>();

        // today 날짜 파싱
        int ty = Integer.parseInt(today.substring(0, 4));
        int tm = Integer.parseInt(today.substring(5, 7));
        int td = Integer.parseInt(today.substring(8, 10));
        int todayTotal = ty * 12 * 28 + tm * 28 + td;  // ✅ 날짜를 하나의 수로 변환

        for (int i = 0; i < privacies.length; i++) {
            // 수집 날짜 파싱
            int y = Integer.parseInt(privacies[i].substring(0, 4));
            int m = Integer.parseInt(privacies[i].substring(5, 7));
            int d = Integer.parseInt(privacies[i].substring(8, 10));

            // 약관 종류 추출
            char termType = privacies[i].charAt(11);

            // 유효기간 찾기
            int month = 0;
            for (String t : terms) {
                if (t.charAt(0) == termType) {
                    month = Integer.parseInt(t.substring(2));
                    break;
                }
            }


            m += month;
            if (m > 12) {
                y += (m - 1) / 12;
                m = (m - 1) % 12 + 1;
            }
            int expireTotal = y * 12 * 28 + m * 28 + d;


            if (expireTotal <= todayTotal) {
                answerInt.add(i + 1);
            }
        }

        int[] answer = new int[answerInt.size()];
        for (int i = 0; i < answerInt.size(); i++) {
            answer[i] = answerInt.get(i);
        }
        return answer;
    }
}