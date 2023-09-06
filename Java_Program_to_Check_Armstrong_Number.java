public class ArmstrongNumber 
{
    public static void main(String[] args)
    {
        int n = 153, p = 0;
        int temp = n;
      
        while (n > 0) 
        {
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
 
        if (temp == p) 
            System.out.println("Yes. It is an Armstrong Number.");
        
        else 
            System.out.println("No. It is not an Armstrong Number.");
    }
}
