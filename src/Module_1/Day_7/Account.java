package Module_1.Day_7;

import java.util.Scanner;


/*
1.3) Create a Class Account with data member Balance.
Create two constructors (one with no argument and one with an argument) and perform the following tasks:

a. Method to deposit the amount into the account.
b. Method to withdraw the amount from the account.
c. Method to display the balance.
 */
public class Account
{
    private double balance; // Data member to store

    // Default constructor (initializes balance to 0)
    public Account()
    {
        this.balance=0.0;
    }

    // Parameterized constructor (initializes balance with a given amount)

    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit amount into the account

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println(amount+" Amount Deposit in your account");
        }
        else {
            System.out.println("Invalid deposit amount");
        }

    }

    // Method to withdraw amount from the account

    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println(amount+" was withdraw in your account");
        }
        else {
            System.out.println("Insufficient balance or invalid amount!");
        }

    }

    // Method to display the account balance

    public void displaybalance()
    {
        System.out.println("Total amount in your account "+balance);
    }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        // Creating an object of Account class
        Account account=new Account();


        boolean flag=true;
        // Using a while loop for continuous user interaction until exit
        while (flag)
        {
            System.out.println(" \n Enter your choice :" +
                    "\n 1.Deposit " +
                    "\n 2.withdraw" +
                    "\n 3.display balance " +
                    "\n 4.close \n");
            int choice = input.nextInt();

            // Using switch-case to execute correct functions based on user input
            switch (choice)
            {
                case 1: {
                    System.out.print("Enter amount to deposit: ");
                    double amount = input.nextDouble();
                    account.deposit(amount);
                    break;
                }

                case 2:
                {
                    System.out.println("Enter amount to withdraw: ");
                    double amount=input.nextDouble();
                    account.withdraw(amount);
                    break;
                }

                case 3:
                {
                    account.displaybalance();
                    break;
                }
                case 4:
                {
                    flag=false;
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice! Please try again.");
                }
            }

        }

    }
}
