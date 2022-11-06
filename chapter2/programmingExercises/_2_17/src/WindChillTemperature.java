import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
//        Scanner object for input
        Scanner input = new Scanner(System.in);

//        Prompt user
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temp = input.nextDouble();

        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpd = input.nextDouble();

        double windChillIdx = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpd, 0.16))
                + (0.4275 * temp * Math.pow(windSpd, 0.16));

        System.out.printf("The wind chill index is %.5f", windChillIdx);
    }
}
