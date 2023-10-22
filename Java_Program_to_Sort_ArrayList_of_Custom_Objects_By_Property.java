import java.util.*;

public class CustomObject 
{
    private String customProperty;

    public CustomObject(String property) 
    {
        this.customProperty = property;
    }

    public String getCustomProperty() 
    {
        return this.customProperty;
    }

    public static void main(String[] args) 
    {
        ArrayList<Customobject> list = new ArrayList<>();
        list.add(new CustomObject("C"));
        list.add(new CustomObject("Q"));
        list.add(new CustomObject("Vv"));
        list.add(new CustomObject("Z"));
        list.add(new CustomObject("B"));
        list.add(new CustomObject("X"));
        list.add(new CustomObject("Pp"));

        list.sort((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));

        for (CustomObject obj : list) 
        {
            System.out.println(obj.getCustomProperty());
        }
    }
}
