public class J9PublicVSPrivate {
    private String name;
    private int age;
    private double salary;
    
    // Constructor to initialize employee/J9PublicVSPrivate details
    public J9PublicVSPrivate(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    // Public function to display employee/J9PublicVSPrivate information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        
        // Call the private function to caculate and display bonus
        calculateBonus();
    }
    
    // Private function to calculate and display bonus
    private void calculateBonus() {
        double bonus = salary * 0.1; // Calculate bonus as 10% of the salary
        System.out.println("Bonus: $" + bonus);
    }

    /*
    The calculateBonus() function cannot be directly invoked outside of the 
    J9PublicVSPrivate class or from other classes. It is declared as a private 
    method within the J9PublicVSPrivate class. This means that it can only be 
    accessed by other methods within the same class.

    In the main() method, which is outside of the J9PublicVSPrivate class, you
    cannot call the calculateBonus() function directly. It can only be called 
    from methods within the J9PublicVSPrivate class, such as in the 
    displayInfo() method.
    */
    
    // Public function to increase the employee/J9PublicVSPrivate's salary by a given percentage
    public void increaseSalary(double percentage) {
        double increaseAmount = salary * percentage / 100; // Calculate the increase amount
        salary += increaseAmount; // Update the salary
        System.out.println("Salary increased by " + percentage + "%. New salary: $" + salary);
    }
    
    // Main method to test the Employee/J9PublicVSPrivate class
    public static void main(String[] args) {
        // Create two employe/J9PublicVSPrivate objects
        J9PublicVSPrivate employee1 = new J9PublicVSPrivate("John Doe", 30, 50000);
        J9PublicVSPrivate employee2 = new J9PublicVSPrivate("Jane Smith", 35, 60000);
        
        // Display information of Employee 1
        System.out.println("Employee 1:");
        employee1.displayInfo();
        
        // Display information of Employee 2
        System.out.println("\nEmployee 2:");
        employee2.displayInfo();    
        
        // Increase the salary of Employee 1 and display the updated information
        System.out.println("\nIncreasing salary of Employee 1:");
        employee1.increaseSalary(5);
        employee1.displayInfo();
    }
}
