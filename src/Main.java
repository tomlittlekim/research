import min.babbling.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        babblingTest();
//        closeLetterTest();
    }

    public static void babblingTest() {
        Solution solution = new Solution();
        String[] testString1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] testString2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(solution.solution(testString1));
        System.out.println(solution.solution(testString2));
    }

    public static void closeLetterTest() {
        closeLetter.Solution solution = new closeLetter.Solution();

        System.out.println(Arrays.toString(solution.solution("banana")));
    }

}