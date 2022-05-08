import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
//        Create Scanner
        Scanner input = new Scanner(System.in);

//        Prompt user to input inital Velocity, final velocity, and time
        System.out.print("Enter v0, v1, and t: ");
        double initalV = input.nextDouble();
        double fintalV = input.nextDouble();
        double time = input.nextDouble();

        double acceleration = ((fintalV - initalV) / time);

//        Display results
        System.out.printf("The average acceleration is %.4f", acceleration);
    }
}
