import java.util.Arrays;
import java.util.Collections;

public class ArrayLac {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 10; // assign value to index
        System.out.println(numbers[0]); // access value by index

        for (int n : numbers) {
            System.out.println(n);
        }

        // use stream api
        int[] result = Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
    }
}
