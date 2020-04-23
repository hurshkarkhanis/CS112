/**
* Deck of cards that has a collection
* of 52 Card objects.
* @author: PLACE YOUR NAME
*/
import java.util.*;

public class DeckOfCards 
{

   //PLACE INSTANCE DATA HERE

    Card[] deck = new Card[52];
    int numCards = 52;



   /**
    * Dafault constructor:
    * Constructor creates 52 Card objects and 
    * initializes each appropriately. No two cards are the same.
    */
   public DeckOfCards(){
    int index = 0;
    int value = 1;
    while(index >= 0 && index <= 12 ){
      if(value <= 13){
        deck[index] = new Card(value, "SPADES");
        value++;
        index++;
      } else{
        value = 1;
      }
    }

    while(index >= 13 && index <= 25 ){
      if(value <= 13){
        deck[index] = new Card(value, "CLUBS");
        value++;
        index++;
      } else{
        value = 1;
      }
    }

    while(index >= 26 && index <= 38 ){
      if(value <= 13){
        deck[index] = new Card(value, "HEARTS");
        value++;
        index++;
      } else{
        value = 1;
      }
    }

    while(index >= 39 && index <= 51 ){
      if(value <= 13){
        deck[index] = new Card(value, "DIAMONDS");
        value++;
        index++;
      } else{
        value = 1;
      }
    }
  }


    
    
   public void shuffle()
   {
    Card buffer = new Card(1, "SPADES");
    Random r = new Random();

    for(int i = 0 ; i < deck.length - 1 ; i++){
      int random = r.nextInt(deck.length);
      deck[i] = deck[random];
      deck[random] = deck[i+1];

   }
 }

   /** 
    * toString method:
    * @overrides toString method to display all 52 cards
    */
   public String toString()
   {
      String out = "";
      for(int i = 0 ; i <= deck.length - 1 ; i++){
        out += (i+1) + ": " + (deck[i].toString()) + "\n";
      }
      return out;
   }

   /**   
    * deal method:
    * removes a Card from the deck
    */ 
   public void deal() 
   {

    Card out = deck[0];
    for(int i = 0 ; i <= deck.length - 2 ; i++){
      deck[i] = deck [i+1]; //move everything over
      
   }

   numCards--;
   System.out.println(out + " HAS BEEN DELT." + "\n" + "THERE ARE NOW " + getCardCount() + " CARD(S) IN THE DECK");
   System.out.println();
 }

   /**
    * getCardCount
    * determines how many cards are left on the deck.
    */ 
   public int getCardCount()
   {
    return numCards;
 }

}











