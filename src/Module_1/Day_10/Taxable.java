package Module_1.Day_10;

import java.util.Scanner;

public interface Taxable
{
    double salesTax = 0.07;
    double incomeTax=0.105;

    public void calTax(); // rule to child class to implemented
}

class Employee implements Taxable
{
    int empId;
    String name;
    double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // default or empty construct to avoid error in objection creation without sent data time
    public Employee() {

    }

    // calculating the income tax for the salary
    @Override
    public void calTax()
    {
       long income_tax= (long) ((long)salary*incomeTax);
        System.out.println("Income tax for a salary of " + salary + " is " + income_tax + ".");
    }
}

class products implements Taxable
{
    int pid;
    double price;
    int quantity;

    public products(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // calculating the sales tax for the product
    @Override
    public void calTax()
    {
        double sales_tax= price*salesTax;
        System.out.println("Sales Tax on Product: " + sales_tax +"Rupees");

    }
}

class DriverMain
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // accesses employee information
        System.out.print("Enter your id :");
        int id=input.nextInt();   //storing id information
        input.nextLine();

        System.out.print("Enter you name: ");

        String name=input.nextLine();

        System.out.print("Enter your yearly salary: ");

        double salary=input.nextDouble();
        input.nextLine();

        Employee employee=new Employee(id,name,salary);  // sending the data to employee class
        employee.calTax();  //calling the function to calculate the tax


        // accesses product information

        System.out.print("Enter ProductId(Pid): ");
        int pid=Integer.parseInt(input.nextLine());

        System.out.print("Enter price of the Product: ");
        long price=Long.parseLong(input.nextLine());

        System.out.print("Enter the quantity of the product : ");
        int quantity=Integer.parseInt(input.nextLine());

        products products=new products(pid,price,quantity);  // sending the data to products class

        products.calTax();  //calling the function to calculate the tax
    }

}
