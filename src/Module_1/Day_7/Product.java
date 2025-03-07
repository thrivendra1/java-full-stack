package Module_1.Day_7;

import javax.swing.*;
import java.util.Scanner;

/*
1.2) Create a class Product (pid, price, quantity) with a parameterized constructor.
Create a main function in a different class (say ProductMain) and perform the following tasks:

a. Accept five product information from the user and store them in an array.
B. Find the pid of the product with the highest price.
c. Create a method (with an array of product objects as an argument) in the ProductMain class to calculate and return the total amount spent on all products.
(Amount spent on a single product = price of product × quantity of product).
 */



// Product class to store product details (PID, price, and quantity)
public class Product
{
    public int pid; // Product ID
    public long price; // Product Price
    public int quantity; // Product Quantity

    // Parameterized constructor to initialize product attributes
    public Product(int pid, long price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

}

// Main class to handle input, process data, and display results
class ProductMain
{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        // Creating an array to store 5 products
        Product[] product=new Product[5];

        // Loop to accept product details from the user
        for (int i = 0; i < product.length; i++)
        {
            System.out.print("Enter ProductId(Pid): ");
            int pid=Integer.parseInt(input.nextLine());

            System.out.print("Enter price of the Product: ");
            long price=Long.parseLong(input.nextLine());

            System.out.print("Enter the quantity of the product : ");
            int quantity=Integer.parseInt(input.nextLine());

            product[i]=new Product(pid,price,quantity);
            System.out.println();
        }

        // Creating an object of ProductMain to call non-static methods
        ProductMain productMain=new ProductMain();


        // Finding the highest price product
        Product highest = productMain.HighestPrice(product);
        System.out.println("Product with Highest Price -> PID: " + highest.pid + ", Price: " + highest.price);

        // Calculating total amount spent
        long totalAmount = productMain.Total_Product_prices(product);
        System.out.println("Total Amount Spent: " + totalAmount);

    }

    // Method to find the product with the highest price
    public Product HighestPrice(Product[] product)
    {

        Product maxproduct=product[0];


        for (int i = 1; i < product.length; i++)
        {
            if(product[i].price>maxproduct.price)
            {
                maxproduct=product[i]; // Update maxProduct if a higher price is found
            }

        }
        return maxproduct;

    }

    // Method to calculate the total amount spent on all products

    public long  Total_Product_prices(Product[] products)
    {
        long totalPrice=0;

        for (int i = 0; i < products.length; i++)
        {
            totalPrice+= (long) products[i].price *products[i].quantity;


        }
        return totalPrice;

    }
}
