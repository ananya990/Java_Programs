class PowerofNum 
{
  public static void main(String[] args) 
  {
    int base = 2, exponent = 5;
    long result = 1;

    for (; exponent != 0; --exponent) 
        result *= base;

    System.out.println("Answer = " + result);
  }
}
