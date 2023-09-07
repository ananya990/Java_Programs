class DecToBin 
{
  public static void main(String[] args) 
  {
    int decimal = 23;
    
    String binary = Integer.toBinaryString(decimal);
    System.out.println(decimal + " in decimal = " + binary + " in binary.");
  }
}
