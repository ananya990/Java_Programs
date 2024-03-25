import java.util.Scanner;

public class LineNumberPrinter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input stream
        Scanner scanner = new Scanner(System.in);
        // Initialize the line number to 1
        int lineNumber = 1;

        // Keep reading lines from input until there are no more lines
        while (scanner.hasNextLine()) {
            // Read the next line from input
            String line = scanner.nextLine();
            // Print the line number and the line content
            System.out.println(lineNumber + " " + line);
            // Increment the line number
            lineNumber++;
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
