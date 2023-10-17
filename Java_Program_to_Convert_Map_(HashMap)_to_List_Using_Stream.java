import java.util.*;
import java.util.stream.Collectors;

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

        List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
        List<String> valueList = map.values().stream().collect(Collectors.toList());

        System.out.println("Key List : " + keyList);
        System.out.println("Value List : " + valueList);
    }
}
