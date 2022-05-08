import java.util.Scanner;

public class SumDigitsInteger {
    public static void main(String[] args) {
//        create scanner
        Scanner input = new Scanner(System.in);

//        Prompt user to enter a number
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

//        Compute sum using recursive method
        int sum = SumDigit(number);

//        Display results
        System.out.println("The sum of the digits is " + sum);
    }

//    Helper method
    public static int SumDigit(int number) {
        return SumDigit(number, 0);
    }

//    Recursive method
    public static int SumDigit(int number, int sum) {
        if(number == 0) {
            return sum;
        } else {
            sum += number % 10;
            number = number / 10;
            return SumDigit(number, sum);
        }
    }
}
