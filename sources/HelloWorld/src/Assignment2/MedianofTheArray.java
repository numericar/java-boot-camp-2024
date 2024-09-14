package Assignment2;

import java.util.Arrays;;

public class MedianofTheArray {
    public static void main(String[] args) {
        int[] example1 = { 5, 7, 8 ,6, 3 };
        int[] example2 = { 5, 7, 8, 6, 3, 1 };
        int[] example3 = { 5 };
        int[] example4 = {};

        System.out.println(findMedian(example1));
        System.out.println(findMedian(example2));
        System.out.println(findMedian(example3));
        System.out.println(findMedian(example4));
    }

    public static int findMedian(int[] arr) {
        if (arr.length == 0) return 0;

        if (arr.length == 1) return arr[0];

        Arrays.sort(arr);

        boolean isEven = (arr.length % 2) == 0;
        if (isEven) {
            return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
        }

        return arr[arr.length / 2];
    }
}
