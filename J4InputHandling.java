import java.util.Scanner;

public class J4InputHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        scanner.close();
    }
}

/*
Notes used to perceive some lines:

Scanner scanner = new Scanner(System.in);
This line creates a new instance of the Scanner class, which is used to read 
input from the user. The Scanner object is initialized with the System.in 
parameter, which represents the standard input stream. It allows the program 
to read input typed by the user in the terminal.

String name = scanner.nextLine();
This line reads a line of text input from the user using the Scanner object. 
The nextLine() method reads the text until it encounters a line break (when 
the user presses Enter). The text input is then stored in the name variable 
of type String.

scanner.close();
This line closes the Scanner object, releasing any system resources associated 
with it. It is important to call the close() method when you're done using the 
Scanner to prevent resource leaks and ensure proper cleanup.
*/