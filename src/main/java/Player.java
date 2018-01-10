import java.util.ArrayList;

public class Player {

    private String name;
    private int pointsTotal;
    private int handTotal;
    private ArrayList<Card> cards;

    public Player(String name){
        this.cards = new ArrayList<>();
        this.pointsTotal = 0;
        this.handTotal = 0;
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public int getPointsTotal() {
        return this.pointsTotal;
    }


    public int getCardCount() {
        return cards.size();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void removeCards(){
        cards.clear();
    }

    public int calculateHandTotal(){
        this.handTotal = 0;
        for (Card card: this.cards ){
            this.handTotal += card.getRank().getValue();
        }
        return this.handTotal;
    }

    public int getHandTotal() {
        return this.handTotal;
    }

    public void addPoint() {
        pointsTotal+=1;
    }
}
