public class CountDigit 
{
  public static void main(String[] args) 
  {
    int count = 0, num = 76780679;

    for (; num != 0; ++count) 
    {
           num /= 10;
    }

    System.out.println("Number of digits : " + count);
  }
}
