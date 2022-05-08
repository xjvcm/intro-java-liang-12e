import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
//        Create Scanner
        Scanner input = new Scanner(System.in);

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

//        Prompt user to enter time zone offet to GMT
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        System.out.println(offset);

//        Compute Current time with offet
        currentHour += offset;

//        Fix negative hour
        if (currentHour < 0) {
            currentHour += 24;
        } else if (currentHour > 24) {
            currentHour -= 24;
        }

        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}