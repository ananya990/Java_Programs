import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeString 
{
    public static void main(String[] args) 
    {
        // Format yyyy-mm-dd
        String string = "2023-10-06";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}
