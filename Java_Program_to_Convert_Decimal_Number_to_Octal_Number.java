public class DecimalOctal 
{
    public static void main(String[] args) 
    {
        int decimal = 110;
        int octal = convertDecimalToOctal(decimal);
        System.out.println(decimal + " in decimal = " + octal + " in octal");
    }

    public static int convertDecimalToOctal(int decimal)
    {
        int octalNumber = 0, i = 1;

        while (decimal != 0)
        {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        return octalNumber;
    }
}
