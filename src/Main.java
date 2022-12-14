import min.research.future.Calculator;
import min.research.future.FactorialSquareCalculator;
import min.test.babbling.Solution;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
//        babblingTest();
//        closeLetterTest();
//        futureExample();
//        forkJoinPoolExample();
//        nextNumberTest();
//        sumOfConsecutiveNumbersTest();
//        paperCutTest();
//        stringPushTest();
        String A = "hello";
        String B = "ohell";
        B = B.repeat(3);
        System.out.println(B);
    }

    public static void stringPushTest() {
        min.test.stringPush.Solution solution = new min.test.stringPush.Solution();
        System.out.println(solution.solution("hello", "ohell"));
        System.out.println(solution.solution("apple", "elppa"));
    }

    public static void paperCutTest() {
        min.test.paperCut.Solution solution = new min.test.paperCut.Solution();
        System.out.println(solution.solution(2, 2));
        System.out.println(solution.solution(2, 5));
        System.out.println(solution.solution(1, 1));
    }

    public static void sumOfConsecutiveNumbersTest() {
        min.test.sumOfConsecutiveNumbers.Solution solution = new min.test.sumOfConsecutiveNumbers.Solution();
        System.out.println(Arrays.toString(solution.solution(3, 12)));
        System.out.println(Arrays.toString(solution.solution(5, 15)));
        System.out.println(Arrays.toString(solution.solution(4, 14)));
        System.out.println(Arrays.toString(solution.solution(5, 5)));
    }

    public static void nextNumberTest() {
        min.test.nextNumber.Solution solution = new min.test.nextNumber.Solution();
        System.out.println(solution.solution(new int[] {1, 2, 3, 4}));
        System.out.println(solution.solution(new int[] {2, 4, 8}));
    }

    public static void babblingTest() {
        Solution solution = new Solution();
        String[] testString1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] testString2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(solution.solution(testString1));
        System.out.println(solution.solution(testString2));
    }

    public static void closeLetterTest() {
        min.test.closeLetter.Solution solution = new min.test.closeLetter.Solution();

        System.out.println(Arrays.toString(solution.solution("banana")));
    }

    public static void futureExample() throws InterruptedException, ExecutionException {
        Calculator calculator = new Calculator();
        Future<Integer> future1 = calculator.calculate(10);
        Future<Integer> future2 = calculator.calculate(100);

        while (!(future1.isDone() && future2.isDone())) {
            System.out.println(
                    String.format(
                            "future1 is %s and future2 is %s",
                            future1.isDone() ? "done" : "not done",
                            future2.isDone() ? "done" : "not done"
                    )
            );
            Thread.sleep(300);
        }

        System.out.println(future1.get() + " and " + future2.get());
    }

    public static void forkJoinPoolExample() {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        FactorialSquareCalculator factorialSquareCalculator = new FactorialSquareCalculator(10);

        forkJoinPool.execute(factorialSquareCalculator);
    }

}