import java.util.Scanner;

class RemoveWhiteSpaces 
{
  public static void main(String[] args) 
  {
    // create an object of Scanner
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string : ");

    // take the input
    String input = sc.nextLine();
    System.out.println("\nOriginal String : " + input);

    // remove white spaces
    input = input.replaceAll("\\s", "");
    System.out.println("Final String :  " + input);
    sc.close();
  }
}
