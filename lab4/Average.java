// *****************************************************************
//   Average.java
//   Read three integers from the user and print their average
// *****************************************************************
import java.util.Scanner;
public class Average
{
   public static void main(String[] args)
   {
      int val1, val2, val3;
      double average;
      //Construct a Scanner object
      Scanner s = new Scanner(System.in);

      System.out.println();

      // get three values from user
      System.out.print("Please the first of three integers: ");
      int first = s.nextInt();

      System.out.print("Please the second integer: ");
      int second = s.nextInt();

      System.out.print("Please the third integer: ");
      int third = s.nextInt();

      double avg = (first+second+third)/3;

      System.out.println();

      System.out.println("YOUR AVERAGE IS: " + avg);

      System.out.println();
       
   } 
}