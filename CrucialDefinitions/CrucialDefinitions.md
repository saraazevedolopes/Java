# Definition

### Atribute
    Attributes, also known as instance variables or fields, are the individual data elements that store specific 
    information within an object. They define the state or characteristics of an object. Each attribute has a name 
    and a data type, such as integers, strings, or booleans, which determine the kind of data it can store.

### Class
    A class is a blueprint or template that describes the properties (attributes) and behaviors (methods) that objects
    of that class will possess.

### Object 
    An object is an instance of a class. It represents a specific entity that can have its own unique data and can 
    perform actions based on the class's defined behaviors (methods).

### Method 
    A method is a block of code that defines the behavior or actions that an object of a class can perform. It 
    encapsulates a series of instructions to perform a specific task.

### Constructor
    A constructor is a special function inside a class that is used to create and set up objects of that class. It is
    like a blueprint or recipe for creating objects. When you create a new object using the constructor, it 
    automatically sets up the object with initial values or performs any necessary setup tasks.

    Think of a constructor as a method that is called when you want to create a new object. It helps ensure that the
    object starts in a valid state or with the desired initial values. Constructors have the same name as the class
    they belong to and do not have a return type.

    In simpler terms, a constructor is like a factory that builds and prepares objects based on a predefined plan,
    allowing you to create objects with the necessary setup without worrying about manual initialization.

### Example
```java
    // Class definition
public class Rectangle {
    // Attributes
    private int width;
    private int height;

    // Constructor
    public Rectangle(int initialWidth, int initialHeight) {
        width = initialWidth;
        height = initialHeight;
    }

    // Method
    public int calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        // Creating an object of the Rectangle class using the constructor
        Rectangle myRectangle = new Rectangle(5, 3); // Object creation using the constructor

        // Accessing attributes of the object
        int rectWidth = myRectangle.width; // Accessing the width attribute
        int rectHeight = myRectangle.height; // Accessing the height attribute

        // Invoking a method on the object
        int area = myRectangle.calculateArea(); // Method invocation on the object

        // Printing the results
        System.out.println("Width: " + rectWidth); // Output: Width: 5
        System.out.println("Height: " + rectHeight); // Output: Height: 3
        System.out.println("Area: " + area); // Output: Area: 15
    }
}
```
    Class: The class is called Rectangle and defines the blueprint for creating rectangle objects.

    Attributes: The attributes width and height represent the dimensions of the rectangle.

    Constructor: The constructor Rectangle(int initialWidth, int initialHeight) initializes the width and height 
    attributes when creating a new Rectangle object.

    Method: The method calculateArea() calculates the area of the rectangle based on its dimensions.

    Object: An object myRectangle is created using the Rectangle class constructor.

    Object Usage: The attributes width and height of the myRectangle object are accessed and assigned values. The 
    calculateArea() method is invoked on the object to calculate the area.

    Printing: The results, including width, height, and area, are printed to the console.