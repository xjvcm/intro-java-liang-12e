import java.util.Scanner;

/**
 * ComputeAverage
 */
public class ComputeAverage {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        // Compute Average
        double average = (num1 + num2 + num3) / 3;

        // Display results
        System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + average);
    }
}
