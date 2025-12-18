import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
  public static void main(String[] args) {
        Deck deck= new Deck(); //Creates the deck for this file using the one in Deck.java I believe.
        
        Deck.shuffle(); //Attempts to shuffle the deck so the number is random
        System.out.println("Your card is " + deck.cards(0).value + "of" + deck.cards(0).suite);
        System.out.println("Opponents card is " + deck.cards(1).value + "of" + deck.cards(1).suite); //Prints the value and suite of both you and your opponents cards
        int x = deck.cards(0).value; //Sets the values into specific integers for future, easier reference in the actual game.
        int y = deck.cards(1).value;
         if (x > y) {
          System.out.println("You Win"); //Compares the two values to see which number is larger, and compares them to decide who wins using if/else if/else
        } else if (x < y) {
          System.out.println("Opponent Wins");
        }  else {
          System.out.println("Tie");
    }
  }
}
        
      