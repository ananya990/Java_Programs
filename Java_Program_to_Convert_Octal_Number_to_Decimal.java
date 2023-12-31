public class OctalDecimal 
{
    public static void main(String[] args) 
    {
        int octal = 62;
        int decimal = convertOctalToDecimal(octal);
        System.out.println(octal+" in octal = " + decimal + " in decimal");
    }

    public static int convertOctalToDecimal(int octal)
    {
        int decimalNumber = 0, i = 0;

        while(octal != 0)
        {
            decimalNumber += (octal % 10) * Math.pow(8, i);
            ++i;
            octal/=10;
        }

        return decimalNumber;
    }
}
