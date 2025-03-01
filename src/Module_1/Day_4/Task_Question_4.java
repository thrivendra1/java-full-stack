package Module_1.Day_4;

import java.util.Scanner;

public class Task_Question_4
{
    public static void main(String[] args) {
        // find the smallest number in the three numbers

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        long first_number=input.nextLong();
        System.out.print("Enter the second_number: ");
        long second_number=input.nextLong();
        System.out.print("Enter the third_number: ");
        long third_number=input.nextLong();

        long smallest=first_number;

        if(second_number<smallest)
        {
            smallest=second_number;
        }
        if(third_number<smallest)
        {
            smallest=third_number;
        }
        System.out.println("Smallest number is : "+smallest);
    }
}
