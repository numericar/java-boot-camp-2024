package Assignment1;

import java.util.Scanner;;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String input = sc.nextLine();

        sc.close();

        int number = Integer.parseInt(input);

        int result = 1; 

        if (number <= 1) {
            System.out.println("Result: " + result);
            return;
        }

        result = interative(number);

        System.out.println("Result: " + result);
    }

    private static int interative(int number) {
        int result = 1;
        for (int multiplier = 2; multiplier <= number; multiplier++) {
            result *= multiplier;
        }

        return result;
    }

    public static int recursive(int number) {
        if (number <= 1) return 1;

        return recursive(number - 1) * number;
    }
}
