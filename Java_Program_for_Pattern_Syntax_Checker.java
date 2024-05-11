/* In this problem, you're tasked with validating the syntax of given regular expression patterns using 
Java's `Pattern.compile` method. The input consists of multiple test cases, where each test case contains 
a string representing a regex pattern. Your task is to determine whether each pattern's syntax is valid or not. 
A regex pattern is considered valid if it can be compiled without errors using the `Pattern.compile` method. 
For each test case, you need to print "Valid" if the syntax of the pattern is correct, and "Invalid" otherwise.*/

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine()); // Read the number of test cases
        
        while (testCases-- > 0) { // Iterate through each test case
            String pattern = in.nextLine(); // Read the regex pattern
            
            try {
                Pattern.compile(pattern); // Try compiling the regex pattern
                System.out.println("Valid"); // If compilation succeeds, print "Valid"
            } 
            catch (PatternSyntaxException e) {
                System.out.println("Invalid"); // If compilation fails due to invalid syntax, print "Invalid"
            }
        }
        
        in.close(); // Close the scanner
    }
}

