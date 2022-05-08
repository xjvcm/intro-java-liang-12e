/**
 * Write a program that reads in the radius and length of a cylinder and computes the area and
 * volume using the following formulas: area = radius * radius * π volume = area * length
 */
import java.util.Scanner;

public class VolCylinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declare radius, length, area, and volume
        double radius;
        double length;
        double area;
        double volume;

        // prompt to enter radius and length
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();
        area = getArea(radius);
        volume = getVolume(area, length);

        System.out.printf("The area is %.4f%n", area);
        System.out.printf("The volume is %.1f%n", volume);
    }

    static double getArea(double radius) {

        return Math.pow(radius, 2) * Math.PI;
    }

    static double getVolume(double area, double length) {

        return area * length;
    }
}
