package Module_1.Day_12;

import java.util.*;

/*
Q1. Ramesh is developing a student management system for a university. In this system, you have a Student class to represent student information. You are asked to help Ramesh to handle exception which can be occurred into program according to following Scenarios:

class Student with attributes roll no, name, age and course. Initialize values through parameterized constructors.
If the age of the student is not between 15 and 21 then generate a user-defined exception "AgeNotWithinRangeException".
If a name contains numbers or special symbols, raise exception "NameNotValidException". Define the two exception classes.
 */
// Student class to store student details
public class Student {

    public int rollNumber; // Stores roll number of the student
    public String name; // Stores name of the student
    public int age; // Stores age of the student
    public String course; // Stores course of the student

    // Parameterized constructor to initialize Student object

    public Student(int rollNumber, String name, int age, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
    }


}

// Custom exception class for invalid age
class AgeNotWithRangeException extends Exception
{
    public AgeNotWithRangeException(String message)
    {
        super(message);  // Passing message to Exception class constructor
    }
}

// Custom exception class for invalid name
class NameNotVaildException extends Exception
{
    public NameNotVaildException(String message)
    {
        super(message); // Passing message to Exception class constructor
    }
}


// Class to test exceptions
class testingException
{
    // Method to check if age is within the valid range (15-21)
    static void ageChecking(int age) throws AgeNotWithRangeException
    {

        if (age <15|| age>21)
        {
            throw new AgeNotWithRangeException(" age should be in 15 - 21");
        }
        System.out.println("correct age");
    }

    // Method to check if the name contains only alphabets
    static void nameChacking(String name) throws NameNotVaildException
    {
        name=name.toLowerCase();

        for (int i=0;i<name.length();i++)
        {
            char c=name.charAt(i);
            if(c<'a' || c>'z')
            {
                throw new NameNotVaildException("Name Not vaild exception");
            }
        }
    }

    // Main method to test the functionality
    public static void main(String[] args)   {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the rollNumber: ");
        int rollnumber=input.nextInt();
        input.nextLine();

        System.out.println("Enter the name: ");
        String Name=input.nextLine();

        System.out.println("ENter your age:");
        int Age=input.nextInt();
        input.nextLine();

        System.out.println("Enter your department");

        String course=input.nextLine();


        try {
            // Checking if age and name are valid
            testingException.ageChecking(Age);
            testingException.nameChacking(Name);

            Student student=new Student(rollnumber,Name,Age,course);
            System.out.println("Student registered successfully!");
        } catch (AgeNotWithRangeException | NameNotVaildException e) {
            System.out.println("Exception : "+e.getMessage()); // Handling exceptions
        }

        input.close();  // Closing Scanner to prevent resource leaks

    }
}



