import java.util.Scanner;

/**
 * ComputeAreaWithConsoleInput
 */

public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = Math.pow(radius, 2) * Math.PI;

        // Display results
        System.out.println("The area for the first of radius " + radius + " is " + area);
    }
}
