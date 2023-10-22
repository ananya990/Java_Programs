public class ByteHex 
{
    public static void main(String[] args) 
    {
        byte[] bytes = {5, 78, 1, 23, 44, 6};

        for (byte b : bytes) 
        {
            String st = String.format("%02X", b);
            System.out.print(st);
        }
    }
}
