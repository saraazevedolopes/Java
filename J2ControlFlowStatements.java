public class J2ControlFlowStatements {

    public static void main(String[] args) {
        int counter = 0;

        // for loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i: " + i);
        }
        System.out.println();

        // while loop
        System.out.println("While loop:");
        while (counter < 5) {
            System.out.println("Value of counter: " + counter);
            counter++;
        }
        System.out.println();

        // do-while loop
        System.out.println("Do-while loop:");
        counter = 0;
        do {
            System.out.println("Value of counter: " + counter);
            counter++;
        } while (counter < 5);
        System.out.println();

        // switch-case statement
        System.out.println("Switch-case:");
        int option = 2;
        switch (option) {
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 2:
                System.out.println("Option 2 selected");
                break;
            case 3:
                System.out.println("Option 3 selected");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        System.out.println();

        // if-else statement
        System.out.println("If-else:");
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
