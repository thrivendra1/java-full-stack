package Module_1.Day_12;

import java.util.Scanner;

/*
Q3.Store name of weekdays in an array (starting from “Sunday” at 0 index). Ask day position from user and print day name.
 Handle array index out of bound exception and give a proper message if a user enters day index outside range (0-6).
 */
public class Weekdays
{
    public static void main(String[] args) {
        String [] weekdays={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Array to store the weekdays (Starting from Sunday at index 0)
        Scanner input= new Scanner(System.in);


        // Asking user for the day index
        System.out.print("Enter the day index (0-6): ");

        try {
            int index=input.nextInt();
            System.out.println(weekdays[index]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Please enter a valid index between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a number.");
        }

    }
}
