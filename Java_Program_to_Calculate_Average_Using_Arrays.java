public class ArrayAverage 
{
    public static void main(String[] args) 
    {
        double[] numArray = { 1, -6, 4.5, -5.56, 33.6, 9.6 };
        double sum = 0.0;

        for (double num: numArray) 
        {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average of array elements is : %.2f", average);
    }
}
