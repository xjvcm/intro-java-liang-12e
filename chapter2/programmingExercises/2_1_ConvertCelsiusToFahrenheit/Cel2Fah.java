import java.util.Scanner;

/**
 * Cel2Fah
 * 
 * Write a program that reads a Celsius degree in a double value from the console then converts it
 * to Fahrenheit, and displays the result. The formula for the conversion is as follows:
 * 
 * fahrenheit = (9 / 5) * celsius + 32
 */
public class Cel2Fah {

    public static void main(String[] args) {
        // Create scanner object and initialize
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;

        System.out.printf("%.1f Celsius is %.1f Fahrenheit%n", celsius, fahrenheit);
    }
}
