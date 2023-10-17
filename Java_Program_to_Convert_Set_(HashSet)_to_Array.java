import java.util.*;

public class SetArray 
{
    public static void main(String[] args) 
    {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        String[] array = new String[set.size()];
        set.toArray(array);

        System.out.println("Array : " + Arrays.toString(array));
    }
}
