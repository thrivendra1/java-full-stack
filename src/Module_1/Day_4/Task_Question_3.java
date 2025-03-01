package Module_1.Day_4;

import java.util.Scanner;

public class Task_Question_3
{
    public static void main(String[] args) {
        // reverse the given input
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        long number = input.nextLong();
        long output=0;

        while (number>0)
        {
            long reminder=number%10;
            output=(output*10)+reminder;
            number/=10;
        }
        System.out.println(output);
    }
}
