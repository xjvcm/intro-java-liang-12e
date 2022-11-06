import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String[] args) {
//        Create a Scanner
        Scanner input = new Scanner(System.in);

//        Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        int amount = input.nextInt();

//        Find the number of dollars
        int numberOfOneDollars = amount / 100;
        amount = amount % 100;

//        Find the number of quarters in the remaining amount
        int numberOfQuarters = amount / 25;
        amount = amount % 25;

//        Find the number of dimes in the remaining amount
        int numberOfDimes = amount / 10;
        amount = amount % 10;

//        Find the number of nickels in the remaining amount
        int numberOfNickels = amount / 5;
        amount = amount % 5;

//        Find the number of pennies in the remaining amount
        int numberOfPennies = amount;

//        Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
