// Issue I encountered is that I was using annual interest rate that was entered as monthly interest rate.
// Needed to convert annual interest rate to monthly interest rate by diving annual rate by 12000

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
//        Scanner object for input
        Scanner input = new Scanner(System.in);

//        Prompt user to input
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();

//        Calculate future investment value
        double futureInvestmentValue = investmentAmount * Math.pow(1 + (monthlyInterestRate), numberOfYears * 12);

//        print result
        System.out.printf("Future value is $%.2f", futureInvestmentValue);
    }
}
