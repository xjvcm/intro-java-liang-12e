import java.util.Scanner;

public class FeetToMeter {
    public static void main(String[] args) {
//        Feet to meter constant
        final double feetToMeter =  0.305;
//        Create Scanner
        Scanner input = new Scanner(System.in);

//        Prompt user to enter value in feet
        System.out.print("Enter a value for feet: ");
        double valueFeet = input.nextDouble();

//        Compute meter from feet
        double valueMeter = valueFeet * feetToMeter;

//        Display results
        System.out.println(valueFeet + " feet is " + valueMeter + " meters");
    }
}
