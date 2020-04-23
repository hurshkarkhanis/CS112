/**
A Card class represents a playing card with a face 
value and a suit.
@author: PLACE YOUR NAME
*/
public class Card
   {
      /*
      public static final int CLUBS = 0;
      public static final int SPADES = 1;
      public static final int HEARTS = 2;
      public static final int DIAMONDS = 3;
      */

      public int VALUE; //ace = 1 , jack = 11, queen = 12, king = 13
      public String SUIT;

      // DECLARE OTHER INSTANCE DATA HERE:
      // CREATE THE CONSTANTS FOR ACE, TWO, THREE, ... , JACK, QUEEN, KING
      // YOU MAY USE ENUMERATed TYPES HERE TOO

      /**
       * Default constructor that creates a card with the given values
       * @param face - integer representing the value of the Card
       * @param suit - integer representing the suit of the Card 
       */
      public Card(int face, String suit)
      {
         VALUE = face;
         SUIT = suit;

      }


      /** getFace method:
       * accessor method that returns the face value of the Card
       * @return an int, the face value of the Card
       */
      public int getFace()
      {
         return VALUE; //EDIT THIS
      }

      public String getSuit()
      {
         return SUIT ;
      }
 
      /** toString method:
       * String representation of the object
       * @return a String
      */
      public String toString()
      {
        
        String out = VALUE + " OF " + SUIT;
        return out; //EDIT THIS
      }
      //ADD OTHER METHODS NEEDED
   }