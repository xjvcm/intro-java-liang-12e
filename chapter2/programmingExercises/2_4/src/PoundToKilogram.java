import java.util.Scanner;

public class PoundToKilogram {
    public static void main(String[] args) {
//        Create Scanner
        Scanner input = new Scanner(System.in);

//        Create Constant
        final double lbToKgRatio = 0.454;

//        Prompt user to enter number of pounds
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

//        compute kilograms
        double kilograms = pounds * lbToKgRatio;

//        Display results
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
