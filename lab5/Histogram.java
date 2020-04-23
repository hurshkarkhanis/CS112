import java.util.Scanner;
import java.io.*;

public class Histogram
{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("histogram.txt"));

        //make counters array and set values to zero
        int[] counters = new int[10];

        for(int i = 0 ; i <= counters.length-1; i++){
        	counters[i] = 0;
        }

        
        //check which slot the value belongs in and increment counters accordingly
        while (scan.hasNextInt())
        {
           int value = scan.nextInt();
           if(value >= 1 && value <= 10){
           		counters[0]++;


           }
           if(value >= 11 && value <= 20){
	           	counters[1]++;

           }
           if(value >= 21 && value <= 30){
	           	counters[2]++;


           }
           if(value >= 31 && value <= 40){
	           	counters[3]++;


           }
           if(value >= 41 && value <= 50){
	           	counters[4]++;


           }
           if(value >= 51 && value <= 60){
	           	counters[5]++;


           }
           if(value >= 61 && value <= 70){
	           	counters[6]++;


           }
           if(value >= 71 && value <= 80){
	           	counters[7]++;


           }
           if(value >= 81 && value <= 90){
	           	counters[8]++;


           }
           if(value >= 91 && value <= 1000){
	           	counters[9]++;

           }
        }
        
        //to print out the indicators ex) 41-50
        int printOut = 1;
        //string to actually print out stars...will be set back to zero each time
        String stars = "";

        //number of values to print at the end
        int numValues = 0;

        
        //printing out the numbers of stars cooresponding to the value in counter along with indicators
        for(int i = 0 ; i <= counters.length-1; i++){
        	System.out.print(printOut + "-" + (printOut+9) + "	" + "|");
        	for(int j = 1 ; j <= counters[i]; j++){
        		stars += "*";
        		numValues++;
        	}
        	System.out.print(stars);
        	System.out.println(" => " + numValues + " VALUES");
        	printOut+=10;
        	stars = "";
        	numValues = 0;
        }


   }
}
