import java.util.Arrays;

public class J7Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenates two strings
        String result1 = str1 + " " + str2; // Using the + operator
        String result2 = str1.concat(" ").concat(str2); // Using the concat() method

        System.out.println("Concatenation:");
        System.out.println("Result 1: " + result1); // Output: Hello World
        System.out.println("Result 2: " + result2); // Output: Hello World
        System.out.println();

        String str = "Hello World";

        // Extracts a substring from a given string
        String substring = str.substring(2, 11);

        System.out.println("Substring:");
        System.out.println("Substring: " + substring); // Output: World
        System.out.println();

        // Determines the length of a string
        int length = str.length();

        System.out.println("Length:");
        System.out.println("Length: " + length); // Output: 11
        System.out.println();

        // Converts a string to uppercase
        String upperCase = str.toUpperCase();

        // Converts a string to lowercase
        String lowerCase = str.toLowerCase();

        System.out.println("Case Conversion:");
        System.out.println("Uppercase: " + upperCase); // Output: HELLO WORLD
        System.out.println("Lowercase: " + lowerCase); // Output: hello world
        System.out.println();

        // Replaces characters or substrings within a string
        String replaced = str.replace("World", "Java");

        System.out.println("Replacement:");
        System.out.println("Replaced: " + replaced); // Output: Hello Java
        System.out.println();

        // Checks if a string starts with a specific prefix
        boolean startsWith = str.startsWith("Hello");

        System.out.println("Starts With:");
        System.out.println("Starts with 'Hello': " + startsWith); // Output: true
        System.out.println();

        // Checks if a string ends with a specific suffix
        boolean endsWith = str.endsWith("World");

        System.out.println("Ends With:");
        System.out.println("Ends with 'World': " + endsWith); // Output: true
        System.out.println();

        // Retrieves the index of a specified character in a string
        int indexOf = str.indexOf('o');

        System.out.println("Index Of:");
        System.out.println("Index of 'o': " + indexOf); // Output: 4
        System.out.println();

        // Checks if a string contains a specific substring
        boolean contains = str.contains("lo");

        System.out.println("Contains:");
        System.out.println("Contains 'lo': " + contains); // Output: true
        System.out.println();

        // Removes leading and trailing whitespace from a string
        String trimmed = "   Hello World   ".trim();

        System.out.println("Trim:");
        System.out.println("Trimmed: " + trimmed); // Output: Hello World
        System.out.println();

        // Splits a string into an array of substrings based on a delimiter
        String[] split = str.split(" ");

        System.out.println("Split:");
        System.out.println("Split[0]: " + split[0]); // Output: Hello
        System.out.println("Split[1]: " + split[1]); // Output: World
        System.out.println();

        // Checks if two strings are equal ignoring case (ignoring uppercase and lowercase letters)
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello world");

        System.out.println("Equals Ignore Case:");
        System.out.println("Equals ignore case: " + equalsIgnoreCase); // Output: true
        System.out.println();

        // Checks if a string is empty
        boolean isEmpty = str.isEmpty();

        System.out.println("Is Empty:");
        System.out.println("Is empty: " + isEmpty); // Output: false
        System.out.println();

        // Reverses a string
        String reversed = new StringBuilder(str).reverse().toString();
        /*
        Note:
        The previous line of code creates a StringBuilder object with the content of the string str, reverses the characters 
        using the reverse() method, converts the reversed StringBuilder object back to a string using the toString() method, 
        and assigns the result to the reversed variable. As a result, the reversed variable will contain the reversed version 
        of the original string str.
        */
        System.out.println("Reverse:");
        System.out.println("Reversed: " + reversed); // Output: dlroW olleH
        System.out.println();

        // Checks if a string matches a regular expression
        boolean matches = str.matches(".*\\s+.*"); // Checks if the string contains one or more whitespace in any position
        String strA = " ";
        boolean matches2 = strA.matches("\\s"); // Checks if the string contains EXCLUSIVELY a white space

        String pattern = "Hello.*";
        boolean matches3 = str.matches(pattern);

        String strB = "Hello";
        boolean matches4 = strB.matches("H.llo"); // '.' represents any character 

        System.out.println("Matches:");
        System.out.println("Matches regex: " + matches); // Output: true
        System.out.println("Matches regex: " + matches2);
        System.out.println("Matches regex: " + matches3);
        System.out.println("Matches regex: " + matches4);
        System.out.println();

        // Retrieves the character at a specific index in a string
        char charAt = str.charAt(4);

        System.out.println("Character At:");
        System.out.println("Character at index 4: " + charAt); // Output: o
        System.out.println();

        // Converts a string to a character array
        char[] charArray = str.toCharArray();

        System.out.println("To Character Array:");
        System.out.println("Character array: " + Arrays.toString(charArray)); // Output: [H, e, l, l, o, , W, o, r, l, d]
        System.out.println();

        // Checks if a string contains only numeric characters
        boolean isNumeric = str.matches("\\d+");

        System.out.println("Is Numeric:");
        System.out.println("Is numeric: " + isNumeric); // Output: false
        System.out.println();

        // Converts an integer to a string
        int number = 123;
        String numberString = String.valueOf(number);

        System.out.println("Convert to String:");
        System.out.println("Number as string: " + numberString); // Output: 123
        System.out.println();
    }
}
