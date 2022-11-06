import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
//        Scanner object for input
        Scanner input = new Scanner(System.in);

//        prompt user to input balance and interest rate
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

//        calculate interest
        double interest = balance * (annualInterestRate / 1200);

//        print results
        System.out.printf("The interest is %.5f", interest);
    }
}
