/*
In Java, a class is a fundamental structure that allows you to define objects. A class
is a kind of blueprint or template from which objects are created. It defines the 
attributes (variables) and behaviors (methods) that objects of the class can have.
*/

public class J6ClassAKAFundamentalStructure {
    // Attributes
    private String brand;
    private String model;
    private int year;
    
    // Constructor - creates the instance J6ClassAKAFundamentalStructure, useful on the line 65
    public J6ClassAKAFundamentalStructure(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // Methods
    public void start() {
        System.out.println("The car is starting.");
    }
    
    public void stop() {
        System.out.println("The car is stopping.");
    }
    
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
    
    public void brake() {
        System.out.println("The car is braking.");
    }
    
    // Getters and Setters
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    /* 
    Getters and Setters: 
    Enables the retrieval of attribute values such as brand, model, and year from an 
    instance of J6ClassAKAFundamentalStructure. For instance, calling car.getBrand() 
    will retrieve the value of the car's brand.
    */
    
    // Main method
    public static void main(String[] args) {
        // Create an instance of J6ClassAKAFundamentalStructure
        J6ClassAKAFundamentalStructure car = new J6ClassAKAFundamentalStructure("Toyota", "Aygo", 2022);

        // Print the car's information
        System.out.println("Car brand: " + car.getBrand());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car year: " + car.getYear());

        // Perform some actions
        car.start();
        car.accelerate();
        car.brake();
        car.stop();
    }
}
