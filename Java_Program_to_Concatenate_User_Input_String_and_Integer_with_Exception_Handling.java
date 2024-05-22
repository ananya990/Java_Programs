/*
 * This program reads a string and an integer from the user,
 * concatenates them, and prints the result. If the input for the integer
 * is invalid (i.e., not a valid integer), it catches the exception and 
 * prints an appropriate error message.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read a string input from the user
        String inputString = scanner.nextLine();

        try {
            // Read an integer input from the user
            int num = Integer.parseInt(scanner.nextLine());

            // Concatenate the string and the integer and print the result
            System.out.println(inputString + num);
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            System.out.println(e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}
