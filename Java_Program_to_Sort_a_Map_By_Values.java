import java.util.*;
import java.util.Map.Entry;

class SortMap 
{
  public static void main(String[] args) 
  {
    LinkedHashMap<String, String> capitals = new LinkedHashMap();
    capitals.put("Switzerland", "Bern");
    capitals.put("India", "New Delhi");
    capitals.put("Thailand", "Bangkok");
    capitals.put("United States", "Washington");
    capitals.put("Bulgaria", "Sofia");
    capitals.put("Australia", "Canberra");
    capitals.put("Armenia", "	Yerevan");
    capitals.put("Brazil", "Brasilia");
    capitals.put("Somalia", "Mogadishu");

    // call the sortMap() method to sort the map
    Map<String, String> result = sortMap(capitals);

    for (Map.Entry entry : result.entrySet()) 
    {
      System.out.print("Key : " + entry.getKey());
      System.out.println(" Value : " + entry.getValue());
    }
  }

  public static LinkedHashMap sortMap(LinkedHashMap map) 
  {
    List <Entry<String, String>> capitalList = new LinkedList<>(map.entrySet());

    // call the sort() method of Collections
    Collections.sort(capitalList, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));

    // create a new map
    LinkedHashMap<String, String> result = new LinkedHashMap();

    // get entry from list to the map
    for (Map.Entry<String, String> entry : capitalList) 
    {
      result.put(entry.getKey(), entry.getValue());
    }

    return result;
  }
}
