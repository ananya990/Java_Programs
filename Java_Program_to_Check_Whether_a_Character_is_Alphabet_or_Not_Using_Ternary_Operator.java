public class AlphabetCheck 
{
    public static void main(String[] args) 
  {
        char c = 'V';
        
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(output);
    }
}
