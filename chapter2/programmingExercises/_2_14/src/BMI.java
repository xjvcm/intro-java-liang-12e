import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
//        Create Scanner object for input
        Scanner input = new Scanner(System.in);

//        Create constants
        final double KG_IN_LB = 0.45359237;
        final double M_IN_IN = 0.0254;

//        Prompt user to input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

//        Prompt user to in put height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double weightInKg = pounds * KG_IN_LB;
        double heightInM = height * M_IN_IN;

        double bmi =  weightInKg / Math.pow(heightInM, 2);

        System.out.printf("BMI is %.4f", bmi);
    }
}