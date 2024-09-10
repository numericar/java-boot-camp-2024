import java.util.Random;

public class ControlStructure {
    public static void main(String[] args) {
        selection();
        System.out.println("----");
        validationGroudClaute(-3);
        System.out.println("----");
        takeAWalkCondition();
        System.out.println("----");
        ifElseIfExample();
        System.out.println("----");
        swithExample("Sunday");
        System.out.println("----");
        nestIfExample(-3);
        System.out.println("----");
        plainsForLoop();
        System.out.println("----");
        whileLoop();
        System.out.println("----");
        recursiveCounter(10);
    }

    public static void selection() {
        // simple if example
        int amount = 20;

        System.out.println("Step 1");
        if (amount > 10) {
            System.out.println("Wow! Amount more than 10");
        }
        System.out.println("Step 2");
        System.out.println("Step 3");
    }

    // simple if
    public static void validationGroudClaute(int amount) {
        if (amount < 0) {
            System.out.println("This is a negative number");
            return;
        }
        
        System.out.println("Accept amount: " + amount);
    }

    // if else 
    public static void takeAWalkCondition() {
        boolean isColdOutSide = false;

        String shirt = "";
        if (isColdOutSide) {
            shirt = "Sweater";
        } else {
            shirt = "Tank top";
        }

        System.out.println(shirt);
    }

    // if-else-if lodder
    public static void ifElseIfExample() {
        int speed = 40;
        String light = "green";

        if (light.equals("red")) {
            speed = 0;
        } else if (light.equals("yellow")) {
            speed = 20;
        } else if (light.equals("green")) {
            speed = 42;
        } else {
            speed = 15;
        }

        System.out.println(speed);
    }

    // switch example
    public static void swithExample(String day) {
        switch (day) {
            case "Monday": 
            case "Tuesday": 
            case "Wednesday": 
            case "Thursday": 
            case "Friday":
                System.out.println("Work");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Stop");
                break;
            default:
                break;
        }
    }

    // validate input
    public static void nestIfExample(int amount) {
        boolean isEnableEmergency = false;
        if (amount < 0) {
            System.out.println("This is a negative amount");

            if (isEnableEmergency) {
                System.out.println("Contract admin now !");
            }
        }

        System.out.println("Success on nest if");
    }

    // Iteration - for loop ใช้เมื่อรู้เงื่อนไขของการทำซ้ำ
    public static void plainsForLoop() {
        String message = "";

        // initialization;condition;updating
        for (int i = 1; i <= 10; i++) {
            message += Integer.toString(i) + " "; 
        }

        System.out.println(message);
    }

    // Iteration - do while
    public static void whileLoop() {
        Random random = new Random();
        int dice = 1;
        int counter = 0;

        while (dice != 4) {
            dice = random.nextInt(5) * 1;
            System.out.println("Dice: " + dice);
            counter++;
        }

        System.out.println("Dice amount: " + counter);
    }

    // Iteration - recursive
    public static int recursiveCounter(int count) {
        if (count <= 0) return 0;

        int recursiveValue = recursiveCounter(count - 1);
        System.out.println(recursiveValue);
        return recursiveValue + 1;
    }
}
