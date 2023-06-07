import java.util.Random;

public class J3GenerateRandomNumber {
    public static void main(String[] args) {
        // Method 1: Using Math.random() to obtain numbers between 0 and 0.1 
        double randomNumber1 = Math.random(); // Generates a random number between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println("Method 1: " + randomNumber1);
        
        // Method 2: Using Math.random() to get numbers between another numerical range
        int randomNumber2 = (int) (Math.random() * 101); // Generates a random number between 0 and 100
        System.out.println("Method 2: " + randomNumber2);

        // Method 3: Using Random.nextInt()
        Random random = new Random();
        int randomNumber3 = random.nextInt(101); // Generates a random number between 0 and 100
        System.out.println("Method 3: " + randomNumber3);
    }
}

/*
Notes used to perceive some lines:

Random random = new Random(); 
This line creates a new instance of the Random class named random. The Random 
class provides methods for generating random numbers. By calling new Random(), 
you create an object that can be used to generate random values.

int randomNumber3 = random.nextInt(101); 
This line generates a random integer between 0 and 100 using the 
nextInt(int bound) method of the Random class. The nextInt() method returns a 
random integer from 0 (inclusive) to the specified bound (exclusive). In this 
case, the bound is 101, so the generated random number will be between 0 and 
100.
*/