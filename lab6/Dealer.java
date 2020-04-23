public class Dealer{
  public static void main (String [] args){
      DeckOfCards x = new DeckOfCards();
      System.out.println("ORDERED DECK:");
      System.out.println(x.toString());
      x.shuffle();
      System.out.println("SHUFFLED DECK:");
      System.out.println(x.toString());
      for(int i = 1 ; i <=52 ; i++){
      x.deal();
      }


    }
}