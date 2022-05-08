import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
//        Create Scanner
        Scanner input = new Scanner(System.in);

//        Prompt user to enter subtotal and gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

//        compute gratuity
        double gratuity = Gratuity(subtotal, gratuityRate);

//      display results
        System.out.println("The gratuity is $" + gratuity + " and total is $" + (subtotal + gratuity));
    }

    static double Gratuity(double subtotal, double rate) {
        return (subtotal * (rate / 100));
    }
}
