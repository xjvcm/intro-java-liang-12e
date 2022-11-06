import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
//        Create Scanner object for input
        Scanner input = new Scanner(System.in);

//        Prompt user to input length of the side
        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();

//        Calculate area of hexagon
        double area = (((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2));

//        print results
        System.out.printf("The area of the hexagon is %.4f", area);
    }
}
