package Module_1.Day_12;

import java.util.Scanner;

/*
Q2. Create a class Voter(voterId, name, age) with parameterized constructor.
 The parameterized constructor should throw a checked/Unchecked exception if age is less than 18.
  The message of exception is “invalid age for voter
 */
// Class to represent a Voter
public class Voter
{
    private int voterID; // Stores voter ID
    private String name; // Stores voter's name
    private int age; // Stores voter's age


    // Parameterized Constructor with Exception Handling
    public Voter(int voterID, String name, int age) {
        this.voterID = voterID;
        this.name = name;
        this.age = age;
    }

    //checking the age
    public static void checkage(int age) throws Exception
    {
        if(age<18)
        {
            throw new Exception("invalid age for voter");
        }
        else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Take voter ID as input
        System.out.print("Enter the voter id : ");
        int voterid=input.nextInt();
        input.nextLine(); // Consume the newline character after integer input

        // Take name as input
        System.out.print("Enter your name: ");
        String Name=input.nextLine();

        // Take age as input
        System.out.print("Enter your Age: ");
        int Age=input.nextInt();
        input.nextLine();

        //using try catch to checking the data
        try {
            Voter.checkage(Age);
            Voter voter=new Voter(voterid,Name,Age);
            System.out.println("Voter registered successfully: " + Name);
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }

        input.close();  // Closing Scanner to prevent resource leaks
    }
}
