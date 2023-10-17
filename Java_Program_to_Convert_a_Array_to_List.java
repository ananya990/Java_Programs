import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class ArrayToList 
{
  public static void main(String[] args) 
  {
    String[] array = {"Hindi", "English", "French", "Spanish"};
    System.out.println("Array : " + Arrays.toString(array));

    List languages = new ArrayList<>(Arrays.asList(array));

    System.out.println("List : " + languages);
  }
}
