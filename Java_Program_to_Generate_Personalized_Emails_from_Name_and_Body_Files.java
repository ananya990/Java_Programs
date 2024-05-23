import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Specify the file paths
        String namesFilePath = "names.txt";
        String bodyFilePath = "body.txt";

        try (
            // Open names.txt for reading
            BufferedReader namesReader = new BufferedReader(new FileReader(namesFilePath));
            
            // Open body.txt for reading
            BufferedReader bodyReader = new BufferedReader(new FileReader(bodyFilePath));
        ) {
            // Read the entire content of the body
            StringBuilder bodyBuilder = new StringBuilder();
            String line;
            while ((line = bodyReader.readLine()) != null) {
                bodyBuilder.append(line).append(System.lineSeparator());
            }
            String body = bodyBuilder.toString();

            // Iterate over names
            String name;
            while ((name = namesReader.readLine()) != null) {
                String trimmedName = name.trim();
                String mail = "Hello " + trimmedName + System.lineSeparator() + body;

                // Write the mails to individual files
                try (BufferedWriter mailWriter = new BufferedWriter(new FileWriter(trimmedName + ".txt"))) {
                    mailWriter.write(mail);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
