import java.util.ArrayList;
import java.util.List;

public class FlattenList {
    public static void main(String[] args) {
        // Creating the list of lists
        List<List<Integer>> myList = new ArrayList<>();
        myList.add(new ArrayList<Integer>() {{ add(1); }});
        myList.add(new ArrayList<Integer>() {{ add(2); add(3); }});
        myList.add(new ArrayList<Integer>() {{ add(4); add(5); add(6); add(7); }});

        // Creating the flat list
        List<Integer> flatList = new ArrayList<>();

        // Flattening the list of lists
        for (List<Integer> sublist : myList) {
            for (Integer num : sublist) {
                flatList.add(num);
            }
        }

        // Printing the flat list
        System.out.println(flatList);
    }
}
