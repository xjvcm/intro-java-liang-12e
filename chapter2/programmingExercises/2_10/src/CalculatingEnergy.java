import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {
//        Create Scanner
        Scanner input = new Scanner(System.in);

//        Prompt user to input mass, initaltemp, finaltemp
        System.out.print("Enter the amount of water in kilograms: ");
        double mass = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

//        Compute Energy
        double energy = mass * (finalTemperature - initialTemperature) * 4184;

//        Display results
        System.out.printf("The energy needed is %.1f", energy);
    }
}
