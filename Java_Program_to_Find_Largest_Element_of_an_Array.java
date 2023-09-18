public class LargestinArray
{
    public static void main(String[] args) 
  {
        double[] numArray = { 7.8, 9.34, -1, 1.45, 7, -8, 2.3 };
        double largest = numArray[0];

        for (double num: numArray) 
        {
            if(largest < num)
                largest = num;
        }

        System.out.format("Largest element = %.2f", largest);
    }
}
