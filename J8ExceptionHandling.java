import java.util.Scanner;

/*
    This program demonstrates exception handling in Java.
    It prompts the user to enter two numbers and performs division on them.
    If the user enters invalid inputs or attempts to divide by zero, appropriate error messages are displayed.
*/

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform division and display the result
            int result = divide(num1, num2);
            System.out.println("The result of division is: " + result);
        } catch (NumberFormatException e) { // NumberFormatException is a predefined exception in Java
            // Catch NumberFormatException if the user enters invalid inputs (non-integer values)
            System.out.println("Invalid input: Please enter integers only.");
        } catch (ArithmeticException e) { // ArithmeticException is a predefined exception in Java
            // Catch ArithmeticException if the user attempts to divide by zero
            System.out.println("Division by zero is not allowed.");
        } finally {
            // Close the scanner in the finally block to ensure it is always closed
            scanner.close();
        }
    }

    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return dividend / divisor;
    }
}
