import java.util.*;

public class MapList 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");

        List<Integer> keyList = new ArrayList(map.keySet());
        List<String> valueList = new ArrayList(map.values());

        System.out.println("Key List : " + keyList);
        System.out.println("Value List : " + valueList);
    }
}
