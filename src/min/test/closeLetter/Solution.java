package min.test.closeLetter;

public class Solution {
    public int[] solution(String s) {
        // banana : [-1, -1, -1, 2, 2, 2]
        int[] answer = new int[s.length()];

        String bowl = "";
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            int value = bowl.lastIndexOf(temp);
            answer[i] = value == -1 ? value : i - value;
            bowl += temp;
        }

        return answer;
    }
}
