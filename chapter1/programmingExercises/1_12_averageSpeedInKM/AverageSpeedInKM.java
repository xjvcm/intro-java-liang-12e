/**
 * (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35
 * seconds. Write a program that displays the average speed in kilometers per hour. (Note 1 mile is
 * equal to 1.6 kilometers.)
 */
public class AverageSpeedInKM {

    public static void main(String[] args) {
        double distanceInMile = 24.0;
        double ranHour = 1.0;
        double ranMinute = 40.0;
        double ranSecond = 35.0;

        double mileToKm = 1.609;
        double distanceInKilometer = distanceInMile * mileToKm;

        double minsInHour = 60.0;
        double secondsInHour = 3600.0;
        double totalTime = ranHour + (ranMinute / minsInHour) + (ranSecond / secondsInHour);
        System.out.println(totalTime);

        double averageSpdKM = (distanceInKilometer / totalTime);

        System.out.printf("Average speed in Km per hour is %.2f%n", averageSpdKM);
    }
}
