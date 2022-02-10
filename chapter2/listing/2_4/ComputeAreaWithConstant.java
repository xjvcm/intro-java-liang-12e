import java.util.Scanner;

/**
 * ComputeAreaWithConstant
 */
public class ComputeAreaWithConstant {

    public static void main(String[] args) {

        // Declare a constant
        final double PI = 3.14159;

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area with constant
        double area = Math.pow(radius, 2) * PI;

        // Display result
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
