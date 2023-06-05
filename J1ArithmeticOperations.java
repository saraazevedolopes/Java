public class J1ArithmeticOperations {
    public static void main(String[] args) {
        // Values
        int a = 5;
        int b = 2;
        System.out.println("Inicial a: " + a + "   " + "Inicial b: " + b);

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int subtraction = a - b;
        System.out.println("Subtraction: " + subtraction);

        // Multiplication
        int multiplication = a * b;
        System.out.println("Multiplication: " + multiplication);

        // Division
        int division = a / b;
        System.out.println("Division: " + division);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        // Increment, from now on, the value of A is its increment and not its initial value
        a++;
        System.out.println("Increment of a: " + a);

        // Decrement
        b--;
        System.out.println("Decrement of b: " + b);

        // Exponentiation
        double power = Math.pow(a, b);
        System.out.println("Exponentiation: " + power);

        // Square Root
        double squareRoot = Math.sqrt(a);
        System.out.println("Square Root of a: " + squareRoot);

        // Absolute Value
        int absoluteValue = Math.abs(-a);
        System.out.println("Absolute Value of -a: " + absoluteValue);
    }
}
