package Assignment1;

import java.util.Scanner;;

public class TriangleOrSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Area calculate program
                'T' => Triangle
                'S' => Square
                """);
        System.out.print("Enter choice: ");
        String choice = sc.nextLine();

        if (choice.equals("t")) {
            System.out.print("Enter base: ");
            double base = Double.parseDouble(sc.nextLine());

            System.out.print("Enter height: ");
            double height = Double.parseDouble(sc.nextLine());

            double area = 0.5 * base * height;
            System.out.println("Triangle area: " + area);

        } else if (choice.equals("s")) {
            System.out.print("Enter base: ");
            double base = Double.parseDouble(sc.nextLine());

            double area = base * 4;
            System.out.println("Square area: " + area);
            
        } else {
            System.out.println("Invalid choice !");
        }

        sc.close();

    }
}
