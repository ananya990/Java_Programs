public class SwapNumbers 
{
    public static void main(String[] args) 
  {
        float first = 2.30f, second = 4.51f;

        System.out.println("----Before Swap----");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        float temporary = first;
        first = second;
        second = temporary;

        System.out.println("----After Swap----");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
