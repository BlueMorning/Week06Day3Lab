import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){

        cards = new ArrayList<>();

        for (Rank rank: Rank.values()){
            for (Suit suit: Suit.values()){
                Card card = new Card(suit, rank);
                cards.add(card);
            }

        }
        this.shuffleCards();
        this.shuffleCards();
        this.shuffleCards();
        this.shuffleCards();
        this.shuffleCards();
        this.shuffleCards();
        this.shuffleCards();
        this.shuffleCards();
        this.shuffleCards();
        this.shuffleCards();
    }

    public int countCards() {
        return cards.size();
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

    public Card removeCard(){

        return this.cards.remove(0);
    }
}
