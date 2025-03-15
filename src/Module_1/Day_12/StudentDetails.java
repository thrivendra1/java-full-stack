package Module_1.Day_12;

import java.util.*;

/*
Q4. Create a HashMap where keys are student names (strings) and values are their corresponding grades (integers).
Create methods to add a new student, remove a student, and Display up a student's grade by name.
 */
public class StudentDetails {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        Map<String,Integer> student=new HashMap<>(); //storing the details of the students

        boolean flag=true; // using the loop the while

        while (flag)
        {
            //choice
            System.out.println("\n" +
                    "1.AddStudent\n" +
                    "2.RemoveStudent\n" +
                    "3.Display student details\n" +
                    "4.Exit");

            int choice=Integer.parseInt(input.nextLine());
            switch (choice)
            {
                case 1:
                {
                    addStudent(student); // calling the add function
                    break;
                }
                case 2:
                {
                    removeStudent(student); //calling the remove function
                    break;
                }
                case 3:
                {
                    Display(student); //calling the display
                    break;
                }
                case 4:
                {
                    flag=false;
                    input.close();
                    break;
                }
                default:
                {
                    System.out.println("Enter number between 1 to 4");
                }
            }
        }
    }

    //adding the student details
    public static void addStudent(Map<String, Integer> student)
    {
        System.out.print("Enter the student name: ");
        String Name=input.nextLine();

        System.out.print("Enter the student grade in numbers: ");
        int grade=input.nextInt();
        input.nextLine();


        student.put(Name,grade);
        System.out.println("Student added successfully!");
    }

    // removing the student detail
    public static void removeStudent(Map<String, Integer> student)
    {
        System.out.print("Enter the student name to remove: ");
        String RemoveName=input.nextLine();
        student.remove(RemoveName);

        System.out.println(RemoveName+" was removed successfully");
    }

    // printing the all data
    public static void Display(Map<String, Integer> student)
    {
        if(student.isEmpty())
        {
            System.out.println("No student records available.");
        }
        else {
            for (Map.Entry<String,Integer> data:student.entrySet())
            {
                System.out.println("Name: "+data.getKey()+" | grades "+data.getValue());
            }
        }
    }
}
