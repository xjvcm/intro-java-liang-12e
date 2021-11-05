/**
 * AverageSpeedInMiles
 * 
 * Assume that a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that
 * displays the average speed in miles per hour. (Note 1 mile is equal to 1.6 kilometers.)
 */
public class AverageSpeedInMiles {

    public static void main(String[] args) {

        double runnerDistKm = 14.0;
        double totalTimeMin = 45.0;
        double totalTimeSec = 30;
        double kmInMi = 1.6;
        double minInHour = 60;
        double secInHour = 3600;


        double runnerDistMi = runnerDistKm / kmInMi;
        // convert total time in terms of hour;
        double totalTimeHour = (totalTimeMin / minInHour) + (totalTimeSec / secInHour);

        double averageSpdMPH = runnerDistMi / totalTimeHour;

        System.out.print(
                "The average speed for a runner with the distance of 14km in 45 mins and 30 secs is ");
        System.out.printf("%.2f%n", averageSpdMPH);
    }
}
