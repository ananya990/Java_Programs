class BinToDec 
{
  public static void main(String[] args) 
  {
    String binary = "11001011";
    
    int decimal = Integer.parseInt(binary, 2);
    System.out.println(binary + " in binary = " + decimal + " in decimal.");
  }
}
