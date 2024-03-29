import java.util.Scanner;

public class DistanceOfTwoPoints {
    public static void main(String[] args) {
//        Create Scanner Object for input
        Scanner input = new Scanner(System.in);

//        Prompt user to input two points
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

//        Calculate distance
        double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);

//        Print results
        System.out.println("The distance between the two points is " + distance);
    }
}
