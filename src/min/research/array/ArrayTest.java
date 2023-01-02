package min.research.array;

public class ArrayTest {

    public boolean test() {
        int[] limitArray = {20, 25};
        if (true) limitArray = new int[]{30, 30};
        int param = 30;

        System.out.println("array 0, 1: " + limitArray[0] + limitArray[1]);
        if (param < limitArray[0] || param > limitArray[1]) return false;
        return true;
    }

}
