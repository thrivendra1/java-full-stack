package Module_1.Day_7;

import java.util.Scanner;

// Employee class that inherits from Person
public class Employee extends Person
{
    public int employeeID;
    public double salary;

    // Constructor to initialize Employee attributes using super() for name and age

    public Employee(String name, int age,int employeeID,double salary) {
        super(name, age); // Calling the constructor of the Person class
        this.employeeID=employeeID;
        this.salary=salary;
    }

    // Method to display employee details
    public void displayemployee()
    {
        super.display(); // Displaying Person (name & age) details
        System.out.println("EmployeeId: "+employeeID+" \nSalary: "+salary);
    }

    // Main method to take user input and display Employee details

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter name: ");
        String userName = input.nextLine();

        System.out.print("Enter age: ");
        int userAge = input.nextInt();

        System.out.print("Enter EmployeeId: ");
        int employeeId=input.nextInt();

        System.out.println("Enter salary:");
        double salary=input.nextDouble();
        // Creating an Employee object with user input
        Employee employee=new Employee(userName,userAge,employeeId,salary);
        // Displaying Employee details
        employee.displayemployee();
    }
}
