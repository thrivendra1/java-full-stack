package Module_1.Day_12;

import java.util.*;

/*
Q5. Use Collection Classes to store Integers .Create some methods for following functionalities .
a. Include functions for pushing elements onto the stack .
b. popping elements from the stack.
c.check stack is empty
 */
public class StackOperations
{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>(); // storing the data

        boolean flag=true; // using the loop the while

        while (flag)
        {
            System.out.println("\n1. Push Element\n2. Pop Element\n3. Display Stack\n4.checkStack is Empty \n5.Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice)
            {
                case 1:{
                    PushElement(stack);
                    break;
                }
                case 2:
                {
                    PopElement(stack);
                    break;
                }
                case 3:
                {
                    DisplayStack(stack);
                    break;
                }
                case 4:
                {
                    checkStackisEmpty(stack);
                }
                case 5:
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

    private static void checkStackisEmpty(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            System.out.println("Stack was empty");
        }
    }

    //removing the last element form stack
    private static void PopElement(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty! Nothing to pop.");
        }
        else {
            System.out.println(stack.pop()+" was removed successfully");
        }

    }

    //printing all number form stacks
    private static void DisplayStack(Stack<Integer> stack)
    {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack Elements: " + stack);
        }
    }

    // adding numbers to stack
    private static void PushElement(Stack<Integer> stack) {
        System.out.print("Enter number to push: ");
        int num = input.nextInt();
        stack.push(num);
        System.out.println("Number was add to stack successfully");
    }
}
