import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(num);
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = String.valueOf(o1);
                String s2 = String.valueOf(o2);

                return (s2 + s1).compareTo(s1 + s2);
            }
        });

        if (list.get(0).equals(0)) {
            return "0";
        }

        for (int num : list) {
            answer.append(num);
        }

        return answer.toString();
    }
}