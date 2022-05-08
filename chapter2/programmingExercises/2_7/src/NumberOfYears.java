import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {

//        Create constants
        final int minInYear = 525600;
        final int minInDay = 1440;

//        Create Scanner
        Scanner input = new Scanner(System.in);

//        Prompt user to enter minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

//        compute years and days
        int years = minutes / minInYear;
        int days = (minutes % minInYear) / minInDay;

//        Display results
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
