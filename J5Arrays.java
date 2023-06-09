public class J5Arrays {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1};

        // Print all elements of the array
        System.out.println("Array elements:");
        printArray(numbers);

        // Print all elements of the array on the same line
        System.out.println("Array elements (inline):");
        printArrayInline(numbers);

        // Calculate the sum of all elements in the array
        int sum = calculateSum(numbers);
        System.out.println("Sum of elements: " + sum);

        // Find the largest and smallest element in the array
        int maximum = findMaximum(numbers);
        int minimum = findMinimum(numbers);
        System.out.println("Largest element: " + maximum);
        System.out.println("Smallest element: " + minimum);

        // Check if a specific value exists in the array
        int target = 3;
        boolean exists = containsValue(numbers, target);
        System.out.println("Array contains " + target + ": " + exists);

        // Reverse the elements in the array
        int[] reversedArray = reverseArray(numbers);
        System.out.println("Reversed array:");
        printArray(reversedArray);
    }

    // Function to print all elements of an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // ln allows space between lines, you can also use System.out.print(arr[i] + "\n");
        }
    }

    // Function to print all the elements of an array on the same line
    public static void printArrayInline(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        // Check if it's not the last element of the array
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println(); // Move to the next line after printing the array
}

    // Function to calculate the sum of elements in an array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Function to find the maximum element in an array
    public static int findMaximum(int[] arr) {
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    // Function to find the minimum element in an array
    public static int findMinimum(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    // Function to check if a specific value exists in an array
    public static boolean containsValue(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Function to reverse the elements in an array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            reversed[i] = arr[j];
        }
        return reversed;
    }
}
