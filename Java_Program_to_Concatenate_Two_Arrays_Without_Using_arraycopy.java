import java.util.Arrays;

public class ConcatArr 
{
    public static void main(String[] args) 
    {
        int[] array1 = {10, 20, 30};
        int[] array2 = {40, 50, 60};

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : array1) 
        {
            result[pos] = element;
            pos++;
        }

        for (int element : array2) 
        {
            result[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(result));
    }
}
