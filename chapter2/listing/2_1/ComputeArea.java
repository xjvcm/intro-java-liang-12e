/**
 * ComputeArea
 */
public class ComputeArea {

    public static void main(String[] args) {

        // Declare radius and area
        // Assign radius to 200
        double radius = 20;
        double area;

        // Compute area
        area = Math.pow(radius, 2) * Math.PI;

        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
