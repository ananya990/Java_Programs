public class CharArrtoString 
{
    public static void main(String[] args) 
    {
        char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String st1 = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println(st1);
        System.out.println(st2);
    }
}
