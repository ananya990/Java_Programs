public class SwapNumbers 
{
    public static void main(String[] args) 
  {
        float first = 10.0f, second = 2.5f;

        System.out.println("----Before Swap----");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("----After Swap----");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
