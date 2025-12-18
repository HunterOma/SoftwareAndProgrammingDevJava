import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Cards> cards;
    public Deck() {
        cards = new ArrayList<Cards>();

            for (int value = 1; value <= 13; value++){
                cards.add(new Spades(value));
                cards.add(new Hearts(value));
                cards.add(new Clubs(value));
                cards.add(new Diamonds(value));

            }

    }
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
