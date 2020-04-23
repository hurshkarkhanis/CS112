//**************************************************************
//File: Paint.java
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width and height
//**************************************************************
import java.util.Scanner;

public class Paint
{

   public static void main(String[] args)
   {
   final int COVERAGE = 350;  //paint covers 350 sq ft/gal

   //declare integers length, width, and height;
   int length, width, height;
   //declare double totalSqFt;
   double totalSqFt;
   //declare double paintNeeded;
   double paintNeeded;
   //declare and initialize Scanner object
   Scanner s = new Scanner(System.in);

   System.out.println();

   //Prompt for and read in the length of the room (in feet)
   System.out.print("Please enter the length of the room (in feet) ");
   length = s.nextInt();
   //Prompt for and read in the width of the room (in feet)
   System.out.print("Please enter the width of the room (in feet) ");
   width = s.nextInt();
   //Prompt for and read in the height of the room (in feet)
   System.out.print("Please enter the height of the room (in feet) ");
   height = s.nextInt();


   //Compute the total square feet to be painted--think
   totalSqFt = length * width * height;

   //Compute the amount of paint needed
   paintNeeded = totalSqFt/COVERAGE;

   //Print the length, width, and height of the room and the
   //number of gallons of paint needed.
   System.out.println();
   
   System.out.println("LENGTH: " + length);
   System.out.println("WIDTH: " + width);
   System.out.println("HEIGHT: " + height);

   System.out.println();

   System.out.println("GALLONS OF PAINT NEEDED: " + paintNeeded + " gallons");

   System.out.println();



   }
}