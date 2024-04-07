/* The function `findDay` takes three integer parameters: `month`, `day`, and `year`, 
representing the month, day, and year of a given date, respectively. 
It returns a string representing the day of the week in capital letters. */

import java.io.*;
import java.util.*;

class Result {
    // Method to find the day of the week for a given date
    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();
        // Set the year, month, and day
        calendar.set(year, month - 1, day); // month is 0-based in Calendar
        
        // Array to store names of days of the week
        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        // Get the index of the day of the week
        int dayOfWeekIndex = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        
        // Return the name of the day of the week
        return daysOfWeek[dayOfWeekIndex];
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to read input from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Create a BufferedWriter to write output to the console
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Read input for month, day, and year
        String[] firstMultipleInput = br.readLine().split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        // Find the day of the week for the given date
        String res = Result.findDay(month, day, year);

        // Write the result to the console
        bw.write(res);
        bw.newLine();

        // Close the BufferedReader and BufferedWriter
        br.close();
        bw.close();
    }
}
