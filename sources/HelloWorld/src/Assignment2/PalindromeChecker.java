package Assignment2;

public class PalindromeChecker {
    public static void main(String[] args) {
        int[] expectedTrue1 = { 1, 2, 3, 3, 2, 1 };
        int[] expectedTrue2 = { 1, 2, 3, 2, 1 };
        int[] expectedFalse = { 1, 2, 4, 3, 6, 5 };

       System.out.println(isPalindrome(expectedTrue1));
       System.out.println(isPalindrome(expectedTrue2));
       System.out.println(isPalindrome(expectedFalse)); 
    }

    public static boolean isPalindrome(int[] arr) {
        for (int left = 0, right = arr.length - 1; left <= right; left++, right--) {
            if (arr[left] != arr[right]) {
                return false;
            }
        }

        return true;
    }
}
