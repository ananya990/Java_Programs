/* We aim to remove duplicate occurrences of words within a sentence, preserving only the first 
instance of each word, regardless of case. This is accomplished using regular expressions (RegEx) 
to match repeated words, making the pattern case-insensitive, and using the `replaceAll` method to 
replace duplicates with their first occurrence. The input comprises multiple sentences, and the 
modified versions, with duplicate words removed, are printed to the standard output. */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords 
{
    public static void main(String[] args) 
    {
        // Define the regex pattern to match repeated words
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // Create a Scanner object to read input from the standard input stream
        Scanner in = new Scanner(System.in);
        
        // Read the number of sentences from input
        int numSentences = Integer.parseInt(in.nextLine());
        
        // Loop through each sentence
        while (numSentences-- > 0) 
        {
            // Read the next sentence from input
            String input = in.nextLine();
            
            // Create a Matcher object to find matches of the regex pattern in the input sentence
            Matcher m = p.matcher(input);
            
            // Replace repeated words with their first occurrence
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Print the modified sentence
            System.out.println(input);
        }
        
        // Close the Scanner object
        in.close();
    }
}
