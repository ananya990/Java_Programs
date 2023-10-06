import java.util.Arrays;

public class ConcatArr 
{
    public static void main(String[] args) 
    {
        int[] array1 = {10, 20, 30};
        int[] array2 = {40, 50, 60};

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
    }
}
