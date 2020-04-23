// ************************************************************
// PlusTest.java
//
// Demonstrate the different behaviors of the + operator
// ************************************************************

public class PlusTest
{
   // -------------------------------------------------
   // main prints some expressions using the + operator
   // -------------------------------------------------
   public static void main (String[] args)
   {
      System.out.println ("This is a long string that is the " +
                  "concatenation of two shorter strings.");
      System.out.println ("The first computer was invented about " + 55 +
                  " years ago.");
      System.out.println ("8 plus 5 is " + 8 + 5);
      //8 and 5 are strings in this case, meaning they will just show up at 85
      System.out.println ("8 plus 5 is " + (8 + 5));
      //because of the parentheses, 8 and 5 are integers and thus are calculated and result in 13
      System.out.println (8 + 5 + " equals 8 plus 5.");
      //the quotations seperate the strings from the integers, and thus 8+5 is 13
   }
}