import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    Create Scanner Object for User input
        Scanner input = new Scanner(System.in);

//    Prompt user to enter speed and acceleration
        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

//    create method to calculate length
        double length = RunwayLength(speed, acceleration);

//    Print results
        System.out.printf("The minimum runway length for this airplane is %.3f", length);
    }

    public static double RunwayLength(double speed, double acceleration) {
        return (Math.pow(speed, 2) / (acceleration * 2));
    }
}