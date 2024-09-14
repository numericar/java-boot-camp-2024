package Assignment2;

public class InTheArraySorted {
    public static void main(String[] args) {
        int[] expectedTrue = { 1, 2, 3, 4, 5, 6 };
        System.out.println(isAscSorted(expectedTrue));

        int[] expectedFalse = { 1, 2, 4, 3, 6, 5 };
        System.out.println(isAscSorted(expectedFalse));
    }

    public static boolean isAscSorted(int[] arr) {
        if (arr.length <= 1) return true;

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = arr[i - 1];

            if (current < previous) {
                return false;
            }
        }

        return true;
    }
}
