import java.time.LocalDateTime;
import java.util.Scanner;

public class DateAndTimeTest {
    public static void main(String[] args) {
        // Prompt user to enter date and time components
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter day:");
        int day = scanner.nextInt();
        System.out.println("Enter hour:");
        int hour = scanner.nextInt();
        System.out.println("Enter minute:");
        int minute = scanner.nextInt();
        System.out.println("Enter second:");
        int second = scanner.nextInt();

        // Create a Date object with the entered components
        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, minute, second);
        DateAndTime date = new DateAndTime(dateTime);

        // Display the original date and time
        System.out.println("Original date and time: " + date.getDateTime());

        // Prompt user to select an option to increase the date and time
        System.out.println("Select an option to increase the date and time:");
        System.out.println("1. Increase seconds");
        System.out.println("2. Increase minutes");
        System.out.println("3. Increase hours");
        System.out.println("4. Increase days");
        System.out.println("5. Increase months");
        System.out.println("6. Increase years");
        int option = scanner.nextInt();

        // Increase the selected time component by a specified amount
        switch (option) {
            case 1:
                System.out.println("Enter seconds to add:");
                long secondsToAdd = scanner.nextLong();
                date.increaseSeconds(secondsToAdd);
                break;
            case 2:
                System.out.println("Enter minutes to add:");
                long minutesToAdd = scanner.nextLong();
                date.increaseMinutes(minutesToAdd);
                break;
            case 3:
                System.out.println("Enter hours to add:");
                long hoursToAdd = scanner.nextLong();
                date.increaseHours(hoursToAdd);
                break;
            case 4:
                System.out.println("Enter days to add:");
                long daysToAdd = scanner.nextLong();
                date.increaseDays(daysToAdd);
                break;
            case 5:
                System.out.println("Enter months to add:");
                long monthsToAdd = scanner.nextLong();
                date.increaseMonths(monthsToAdd);
                break;
            case 6:
                System.out.println("Enter years to add:");
                long yearsToAdd = scanner.nextLong();
                date.increaseYears(yearsToAdd);
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
        }

        // Display the updated date and time
        System.out.println("New date and time: " + date.getDateTime());

        scanner.close();
    }

}