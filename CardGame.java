import java.util.ArrayList;

public class CardGame {
  public static void main(String[] args) {
        
        ArrayList<Integer> deck = new ArrayList<Integer>();
        
        deck.add(c1); //Meant to put the specific cards made in CardsList into an array list.
        deck.add(c2);
        deck.add(c3);
        deck.add(c4);
        deck.add(c5);
        deck.add(c6);
        deck.add(c7);
        deck.add(c8);
        deck.add(c9);
        deck.add(c10);
        Collections.shuffle(deck); //Attempts to shuffle the deck so the number is random
        
        System.out.println(Integer.compare(deck.get(0), deck.get(1))); //Meant to get the 1st and 2nd number randomized in the deck, and compare them to print which number is bigger (1 = win, 0 = tie, -1 = loss)
}
}