import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        for (int i = 0; i < 4; i++) {       //i rprezentuje ilość kolorów
            for (int j = 0; j < 13; j++) {    //j reprezentuje wartosci
                cards.add(new Card(Suit.values()[i], CardValue.values()[j]));
            }

        }
    }
}
