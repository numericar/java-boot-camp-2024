import java.util.Scanner;

public class App {
    // args = argumentse
    public static void main(String[] args) {
        // Create selt introduction program
        /*
         * Multiple line commments
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide any input: ");
        String text = scanner.nextLine();

        scanner.close();

        System.out.println("Hello, My name is Chanokchon Wongjampa");
        System.out.println("I'm living in Bangkok, Thailand");
        System.out.println("User input: " + text);
    }
}
