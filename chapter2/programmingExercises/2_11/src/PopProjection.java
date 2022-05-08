import java.util.Scanner;

/**
 * PopulationProjection
 */
public class PopProjection {

    public static void main(String[] args) {
//        Create Scanner
        Scanner input = new Scanner(System.in);

        // Time constants
        double secondsInHours = 3600.0;
        double hoursInDay = 24.0;
        double daysInYear = 365.0;
        double secondsInYear = secondsInHours * hoursInDay * daysInYear;

        // Mortality Rates
        double birthRateSec = 7.0;
        double deathRateSec = 13.0;
        double immigrantRateSec = 45.0;

        double birthRateYear = secondsInYear / birthRateSec;
        double deathRateYear = secondsInYear / deathRateSec;
        double immigrantRateYear = secondsInYear / immigrantRateSec;

        double mortalityRateYear = birthRateYear - deathRateYear + immigrantRateYear;

        double currentPopulation = 312_032_486.0;

//        double projectPopulationYear1 = currentPopulation + mortalityRateYear;
//        double projectPopulationYear2 = projectPopulationYear1 + mortalityRateYear;
//        double projectPopulationYear3 = projectPopulationYear2 + mortalityRateYear;
//        double projectPopulationYear4 = projectPopulationYear3 + mortalityRateYear;
//        double projectPopulationYear5 = projectPopulationYear4 + mortalityRateYear;
//
//        System.out
//                .println("The projected population (current: 312,032,486) for the next five year:");
//        System.out.println("Year 1: " + projectPopulationYear1);
//        System.out.println("Year 2: " + projectPopulationYear2);
//        System.out.println("Year 3: " + projectPopulationYear3);
//        System.out.println("Year 4: " + projectPopulationYear4);
//        System.out.println("Year 5: " + projectPopulationYear5);

//        TODO
//        The current code is incorrect. To get the population for x number of years, it would equal to the current
//        population + the mortality rate multiplied by the number of years projected

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        int projectedPopulation = (int)(currentPopulation + (mortalityRateYear * years));
        System.out.print("The population in " + years + " years is " + projectedPopulation);
    }
}
