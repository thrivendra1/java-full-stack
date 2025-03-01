package Module_1.Day_4;

import java.util.Scanner;

public class Task_Question_6
{
    public static void main(String[] args) {
        /*
        Print this patter
        55555
        54444
        54333
        54322
        54321
         */

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of lines you want to print: ");
        int lines=input.nextInt();
        for(int i=0;i<lines;i++)
        {
            int k=lines;
            for(int j=0;j<lines;j++) {
                System.out.print(k + " ");
                if (i > j) {
                    k--;
                }

            }
            System.out.println();
        }
    }
}
