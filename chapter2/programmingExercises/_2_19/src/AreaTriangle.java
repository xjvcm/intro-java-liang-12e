import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
//        Create scanner object
        Scanner input = new Scanner(System.in);

//        Prompt user to input side length
        System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

//        Calculate side length
        double side1 = (Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)),0.5));
        double side2 = (Math.pow((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)),0.5));
        double side3 = (Math.pow((Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)),0.5));

//        calculate s
        double s = (side1 + side2 + side3) / 2;

//        Calculate area
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

//        print results
        System.out.printf("The area of the triangle is %.1f", area);
    }
}
