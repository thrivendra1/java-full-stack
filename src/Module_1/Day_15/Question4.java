package Module_1.Day_15;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

/*
4. Rajesh has been given a task to create an app which takes the user's birthdate as input and calculates their age, you have to help him to build this app using the java.time.LocalDate class.
Input:
Enter your birthdate (yyyy-mm-dd): 1990-05-15
Output:
Your age is: 33 years, 4 months, and 13 days

 */
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String dateofbirth = input.nextLine();

        // Parsing input date to LocalDate
        LocalDate birthDate = LocalDate.parse(dateofbirth);
        LocalDate currentDate = LocalDate.now();

        // Calculating the age using Period
        Period age = Period.between(birthDate, currentDate);

        // Displaying the result
        System.out.println("Your age is: " + age.getYears() + " years, " +
                age.getMonths() + " months, and " +
                age.getDays() + " days.");

        input.close();
    }
}
