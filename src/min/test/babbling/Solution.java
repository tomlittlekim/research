package min.test.babbling;

import java.util.HashMap;

public class Solution {

    public int solution(String[] babbling) {
        // ["aya", "yee", "u", "maa", "wyeoo"] : 1
        // ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"] : 3

        int answer = 0;

        String[] words = {"aya", "ye", "woo", "ma"};

        for (String element : babbling) {
            HashMap<String, String> used = new HashMap<>();
            boolean cut = false;
            do {
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    if (element.startsWith(word) && !used.containsKey(word)) {
                        element = element.substring(word.length());
                        used.put(word, "");
                        cut = true;
                        break;
                    } else {
                        cut = false;
                    }
                }
                if ("".equals(element)) {
                    answer++;
                    cut = false;
                }
            } while(cut);
        }

        return answer;
    }

}
