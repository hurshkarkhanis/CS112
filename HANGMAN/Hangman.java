/**
 *
 * @author Hursh Karkhanis
 * @version 1.0
 * @since 2/15/18
 * Hangman.java
 *
 * This program allows a user to play Hangman with the computer.
 * --EXPLAIN THE RULES--
 * 
 */
import java.util.*;
import java.lang.*;

public class Hangman
{

   static String movieList[] = {"Star Wars: The Last Jedi",
                                "The Matrix",
                                "Avatar", 
                                "Hitch",
                                "Shawshank Redemption",
                                "Castaway", 
                                "Limitless", 
                                "Crazy Rich Asians", 
                                "The Godfather", 
                                "Rocky", 
                                "Creed", 
                                "Apollo 13", 
                                "Forrest Gump", 
                                "Think Like a Man", 
                                "The Post", 
                                "Moonlight", 
                                "12 Years a Slave", 
                                "Oceans 11", 
                                "The Hangover", 
                                "Rat Race", 
                                "A League of Their Own", 
                                "The Sandlot", 
                                "Like Mike", 
                                "Casino Royale", 
                                "Goldeneye", 
                                "From Russia With Love", 
                                "The Taking of Pehlam 123",
                                "The Avengers", 
                                "Shrek",
                                "Full Metal Jacket", 
                                "Hancock", 
                                "Pursuit of Happyness", 
                                "Pulp Fiction", 
                                "From Here to Eternity", 
                                "The Manchurian Candidate"};


   public static void main(String[] args)
   {
      



    Hangman h = new Hangman();
      

      Random random = new Random();
      Scanner s = new Scanner(System.in);
      String currentGuess;
      

      System.out.println("++++++++++++++++++++++++++++++++");
      System.out.println("WELCOME TO HANGMAN");
      System.out.println("GUESS THE MOVIE LETTER BY LETTER");
      System.out.println("SEVEN GUESSES AND YOU'RE OUT!");
      System.out.println("++++++++++++++++++++++++++++++++");

      System.out.println();



      int randomIndex = random.nextInt(movieList.length);

      String movie = movieList[randomIndex];
      String dashes = "";


      int numWrong = 0;
      int flips = 0;
      int correct = 0;
      boolean done = false;


      
     

      for(int i = 0; i <= movie.length()-1; i++){
        if(movie.charAt(i) == ':' || ( ((int)movie.charAt(i)) >= 48 && ((int)movie.charAt(i)) <= 57) || ((int)movie.charAt(i)) == 32 ){
          dashes+=movie.charAt(i);
        } else{
          dashes+="*";
        }
      }

      System.out.println(dashes);
      System.out.println();

      StringBuilder sb = new StringBuilder(dashes);

      while(numWrong < 8 && done == false){
      
        System.out.print("GUESS A LETTER: ");
        currentGuess = s.nextLine();
        char guess = currentGuess.charAt(0);

        

        for(int i = 0 ; i <= movie.length()-1; i++){
          if(movie.charAt(i) == guess){
            sb.setCharAt(i, guess);
            flips++;
            correct++;



          }
        }

        for(int i = 0 ; i <= movie.length()-1; i++){
          if(movie.charAt(i) ==  Character.toUpperCase(guess)){
            sb.setCharAt(i, Character.toUpperCase(guess));
            flips++;
            correct++;


          }

        }

        if(flips == 0){
          numWrong++;
          System.out.println("WRONG GUESS #" + numWrong +  "! YOU HAVE " + (7-numWrong) + " WRONG GUESSES LEFT");
        }

        flips = 0;

        if(numWrong == 8){
          System.out.println("TOO MANY WRONG GUESSES! GAME OVER.");
        } else{
          if(correct >= movie.length()){
            System.out.println("CONGRATULATIONS! YOU WIN!");
            done = true;

          }
        }
        System.out.println(sb);

      }
    }
  }


   