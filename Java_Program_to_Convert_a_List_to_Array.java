import java.util.ArrayList;

class ListToArray 
{
  public static void main(String[] args) 
  {
    ArrayList languages = new ArrayList<>();

    languages.add("Hindi");
    languages.add("English");
    languages.add("French");
    languages.add("Spanish");
    System.out.println("ArrayList : " + languages);

    String[] arr = new String[languages.size()];

    languages.toArray(arr);
    System.out.print("Array : ");
    
    for(String item:arr) 
    {
      System.out.print(item+", ");
    }
  }
}
