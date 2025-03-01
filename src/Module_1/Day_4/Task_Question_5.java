package Module_1.Day_4;

import java.util.Scanner;

public class Task_Question_5
{
    public static void main(String[] args) {
        //if purchase less than 500 No discount, 500 to 1000 give 10% discount and above 1000 give 20% discount
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the purchase price: ");
        int purchase=input.nextInt();



        if(purchase<500)
        {
//
            System.out.println("The purchase amount was 500, so there was no discount ");

        }
        else if(purchase>=500 && purchase<=1000)
        {
//
            System.out.println("After the 10% discount, the final price was : "+ ( purchase-(purchase/10)) );


        }
        else if(purchase>1000)
        {
//
            System.out.println("After the 20% discount, the final price was : "+ (purchase-((purchase/10)*2)) );

        }



    }
}
