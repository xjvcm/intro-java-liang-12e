//Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth
//month. (In Programming Exercise 5.30, you will use a loop to simplify the code and display the account value for
//any month.)

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
//        Create Scanner Object for input
        Scanner input = new Scanner(System.in);

//        Create the constant for interest rate
        final double INTEREST_RATE = 1.00417;

//        Prompt user to enter monthly saving amount
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        double firstMonth = monthlySaving * INTEREST_RATE;
        double secondMonth = (monthlySaving + firstMonth) * INTEREST_RATE;
        double thirdMonth = (monthlySaving + secondMonth) * INTEREST_RATE;
        double fourthMonth = (monthlySaving + thirdMonth) * INTEREST_RATE;
        double fifthMonth = (monthlySaving + fourthMonth) * INTEREST_RATE;
        double sixthMonth = (monthlySaving + fifthMonth) * INTEREST_RATE;

//        Print results
        System.out.printf("After the sixth month, the account value is $%.2f", sixthMonth);
    }
}
