package Assignment1;

import java.util.Scanner;

public class AverageOfTenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int n = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number: ");
            double input = Double.parseDouble(sc.nextLine());
            sum += input;
        }

        sc.close();

        System.out.println("Average: " + (sum / n));
    }
}
