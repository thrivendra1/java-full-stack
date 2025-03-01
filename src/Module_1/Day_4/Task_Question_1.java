package Module_1.Day_4;

import java.util.Scanner;

public class Task_Question_1
{
    public static void main(String[] args) {
        // print 10 to  50 numbers using loops
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Start number: ");
        int start=input.nextInt();
        System.out.print("Enter End number: ");
        int end=input.nextInt();



        for(int i=start;i<=end;i++)
        {
            System.out.println(i);
        }
    }
}
