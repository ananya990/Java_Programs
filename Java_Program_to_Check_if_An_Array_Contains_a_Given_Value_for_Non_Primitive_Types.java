import java.util.Arrays;

class FindElement 
{
  public static void main(String[] args)
  {
    String[] strings = {"One","Two","Three","Four","Five"};
    String toFind = "Two";

    boolean found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind));

    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");
  }
}
