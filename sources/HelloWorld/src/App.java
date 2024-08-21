import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    // args = arguments
    public static void main(String[] args) throws IOException {
        // Create self introduction program
        /*
         * Multiple line comments
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please provide any input: ");
        String text = scanner.nextLine();

        scanner.close();

        System.out.println("Hello, My name is Chanokchon Wongjampa");
        System.out.println("I'm living in Bangkok, Thailand");
        System.out.println("User input: " + text);

        // another version of read input
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferReader = new BufferedReader(streamReader);
        String intput = bufferReader.readLine();
    }
}
