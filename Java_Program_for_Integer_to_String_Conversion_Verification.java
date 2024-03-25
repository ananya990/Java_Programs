import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        try (Scanner in = new Scanner(System.in)) { // Create a Scanner object to read input from standard input
            int n = in.nextInt(); // Read an integer from input
            String s = Integer.toString(n); // Convert the integer to a string
            if (n == Integer.parseInt(s)) { // Check if the integer can be converted back to its original value
                System.out.println("Good job"); // If successful, print "Good job"
            } else {
                System.out.println("Wrong answer"); // If conversion fails, print "Wrong answer"
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!"); // Handle any exceptions that occur during execution
        }
    }
}
