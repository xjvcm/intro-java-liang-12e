import java.util.Scanner;

/**
 * @author : Jonathan Manzano
 *
 */
public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("EEnter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double gallon = distance / milesPerGallon;
        double cost = gallon * pricePerGallon;

        System.out.printf("The cost of driving if $%.2f", cost);
    }
}
