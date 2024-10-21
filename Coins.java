public class Coins
{
  public static void main(String[] args)
  {
    public static void coinConverter(int pennies) {

      int dollars = pennies / 100;
      pennies %= 100;

      int quarters = pennies / 25;
      pennies %= 25;

      int dimes = dimes / 10;
      dimes %= 10;

      int nickles = nickles / 5;
      nickles %= 5;

      int remainingPennies = pennies;

      System.out.println("Dollar Bills: " + dollars);
      System.out.println("Quaters: " + quarters);
      System.out.println("Dimes: " + dimes);
      System.out.println("Nickles: " + nickles);
      System.out.println("Pennies: " + remainingPennies);


    }
   
   

  }

  

}
