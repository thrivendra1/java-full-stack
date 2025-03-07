package Module_1.Day_7;

import java.util.Scanner;


    /*
    Q1. Write a Java program on the below question [OOP’s].

    1.1) Create a class Person with properties (name and age) with the following features:
    a. Default age of the person should be 18.
    b. A Person object can be initialized with name and age.
    c. Method to display name and age of the person.
     */
public class Person
{
    // Creating two variables to store the data of the object
    public String name;
    public int age=18;

    //constructor to initialize name and age
    public Person(String name, int age)
    {
        // The 'this' keyword is used to differentiate between instance variables (global) and local variables.
        this.name = name;
        this.age = age;  // The Default age is set to 18
    }

    // Print the data using display method
    public void display()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Age : "+this.age);
    }


}



