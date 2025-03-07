package Module_1.Day_7;

import java.util.Scanner;

/*
1.4) Define a base class Person with attributes name and age:
Create a subclass Employee that inherits from Person and adds attributes like employeeID and salary.
Use the super keyword to initialize the Person attributes in the Employee constructor.
 */
// Employee class that inherits from Person

public class persons {
    // Creating two variables to store the data of the object
    public String name;
    public int age = 18;

    //constructor to initialize name and age
    public persons(String name, int age) {
        // The 'this' keyword is used to differentiate between instance variables (global) and local variables.
        this.name = name;
        this.age = age;  // The Default age is set to 18
    }

    // Print the data using display method
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age : " + this.age);
    }

}
 class Employee extends persons
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

        System.out.print("Enter salary: ");
        double salary=input.nextDouble();
        // Creating an Employee object with user input
        Employee employee=new Employee(userName,userAge,employeeId,salary);
        // Displaying Employee details
        employee.displayemployee();
    }
}
