import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections.ListUtils;

public class JoinLists 
{
    public static void main(String[] args) 
    {
        List<String> list1 = new ArrayList<String>();
        list1.add("A");

        List<String> list2 = new ArrayList<String>();
        list2.add("B");

        List<String> joined = ListUtils.union(list1, list2);

        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);
        System.out.println("Joined : " + joined);
    }
}
