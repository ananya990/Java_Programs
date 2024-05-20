/*
 * Email Generator Program
 * This program reads names from "names.txt" and an email body from "body.txt",
 * then generates individual email files for each name.
 */

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class EmailGenerator 
{
    public static void main(String[] args) 
    {
        // Paths to the files
        Path namesPath = Paths.get("names.txt");
        Path bodyPath = Paths.get("body.txt");

        try {
            // Read all lines from the names file
            List<String> names = Files.readAllLines(namesPath);

            // Read the entire content of the body file
            String body = new String(Files.readAllBytes(bodyPath), "UTF-8");

            // Iterate over each name and generate individual email files
            for (String name : names) {
                String trimmedName = name.trim();
                String mailContent = "Hello " + trimmedName + "\n" + body;

                // Write the mail content to individual files
                Path mailFilePath = Paths.get(trimmedName + ".txt");
                Files.write(mailFilePath, mailContent.getBytes("UTF-8"));
            }

            System.out.println("Emails generated successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
