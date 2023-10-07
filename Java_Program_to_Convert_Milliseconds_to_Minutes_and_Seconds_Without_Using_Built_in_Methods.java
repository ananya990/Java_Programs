class ConvertMillisecsToMinsSecs 
{
  public static void main(String[] args) 
  {
    long milliseconds = 5320034;

    long seconds = (milliseconds / 1000);
    System.out.println(milliseconds + " Milliseconds = " + seconds + " Seconds");

    long minutes = (milliseconds / 1000) / 60;
    System.out.println(milliseconds + " Milliseconds = " + minutes + " Minutes");
  }
}
