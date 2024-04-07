/* To implement a Java class that initializes and calculates the area of a 
parallelogram using static initialization blocks, handling exceptions 
for invalid inputs. It prompts the user to input the breadth and height of the 
parallelogram and checks if both values are positive. If the inputs are valid,
it calculates and outputs the area; otherwise, it throws an exception. */

import java.util.Scanner;

public class Solution 
{
    static boolean flag = true;
    static int B;
    static int H;
    static 
    {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        
        if (B <= 0 || H <= 0) 
        {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) 
    {
        if (flag) 
        {
            int area = B * H;
            System.out.print(area);
        }
    }
}
