import min.babbling.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] testString1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] testString2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(solution.solution(testString1));
        System.out.println(solution.solution(testString2));
    }
}