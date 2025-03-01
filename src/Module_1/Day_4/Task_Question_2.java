package Module_1.Day_4;

import java.util.Scanner;

public class Task_Question_2
{
    public static void main(String[] args) {
        // find give number is positive or negative
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        if(number>=0)
        {
            System.out.println("Given number was Positive");
        }
        else {
            System.out.println("Given number was Negative");
        }
    }
}
