import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    // Method to raise salary by a given percentage
    double raiseSalary(double percent) {
        salary += salary * percent / 100;  // Increase salary by the percentage
        return salary;  // Return updated salary
    }

    // Method to display employee details
    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Pgm3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);
        
        // Initializing employee details
        e.name = "Shine";
        e.id = 1;  // ID should be an integer, leading zeroes are unnecessary
        e.salary = 20000;  // Initial salary
        
        // Displaying initial employee details
        e.display();
        
        // Asking for salary increment percentage
        System.out.println("Enter the percentage to increment:");
        double percent = sc.nextDouble();  // Read the percentage value

        // Showing the updated salary after increment
        System.out.println("Salary after increment: " + e.raiseSalary(percent));
        
        // Closing the scanner to avoid resource leak
        sc.close();
    }
}
