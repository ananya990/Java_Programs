public class ReverseString
{
  public static void main(String[] args) 
  {
    String sentence = "Have a good day";
    String reversed = reverse(sentence);
    System.out.println("The reversed sentence is : " + reversed);
  }

  public static String reverse(String sentence) 
  {
    if (sentence.isEmpty())
      return sentence;

    return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}
