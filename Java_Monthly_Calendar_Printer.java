import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get year input
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Get month input
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // Print the calendar
        printMonthCalendar(year, month);
    }

    public static void printMonthCalendar(int year, int month) {
        // Create a Calendar object
        Calendar calendar = new GregorianCalendar(year, month - 1, 1);

        // Get the name of the month and the year
        String monthName = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.getDefault());
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print the header
        System.out.println("     " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Get the day of the week of the first day of the month
        int startDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Print leading spaces
        for (int i = 1; i < startDayOfWeek; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            // Move to the next line after Saturday
            if ((day + startDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
