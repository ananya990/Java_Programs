import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1HashFile {
    public static String hashFile(String filename) throws IOException, NoSuchAlgorithmException {
        // Create a MessageDigest instance for SHA-1
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");

        // Open the file for reading in binary mode
        FileInputStream fileInput = new FileInputStream(filename);

        // Read the file and update the hash calculation
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fileInput.read(buffer)) != -1) {
            sha1.update(buffer, 0, bytesRead);
        }

        // Close the file input stream
        fileInput.close();

        // Convert the hash bytes to a hex string
        byte[] hashBytes = sha1.digest();
        StringBuilder hashString = new StringBuilder();
        for (byte b : hashBytes) {
            hashString.append(String.format("%02x", b));
        }

        return hashString.toString();
    }

    public static void main(String[] args) {
        try {
            String message = hashFile("track1.mp3");
            System.out.println(message);
        } catch (IOException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
