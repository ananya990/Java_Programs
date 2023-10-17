import java.util.*;

public class ArraySet 
{
    public static void main(String[] args) 
    {
        String[] array = {"A", "B", "C", "D", "E"};
        Set<String> set = new HashSet<>(Arrays.asList(array));

        System.out.println("Set : " + set);
    }
}
