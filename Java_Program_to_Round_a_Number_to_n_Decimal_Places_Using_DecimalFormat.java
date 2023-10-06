import java.math.RoundingMode;
import java.text.DecimalFormat;

public class RoundOff 
{
    public static void main(String[] args) 
    {
        double num = 3.836842;
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));
    }
}
