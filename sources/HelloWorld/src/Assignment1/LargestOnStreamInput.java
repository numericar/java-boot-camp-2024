package Assignment1;

import java.util.Scanner;

public class LargestOnStreamInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Largest number from stream of input
                Please type any integer to find a largest value
                Note: 0 or negative number to stop stream
                """);

        int numberInput = 1;
        int numberResult = 1;
        while (numberInput > 0) {
            String input = sc.nextLine();
            numberInput = Integer.parseInt(input);

            if (numberResult < numberInput) {
                numberResult = numberInput;
            }
        }

        System.out.println("Large number: " + numberResult);

        sc.close();
    }
}
