import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;
    private int roundNumber;
    private int roundsTotal;
    private int handSize;

    public Game(ArrayList<Player> players, int roundsTotal, int handSize){
        this.players = players;
        this.roundsTotal = roundsTotal;
        this.handSize = handSize;
        deck = new Deck();
    }


    public int getPlayerCount() {
        return this.players.size();
    }

    public Deck getDeck() {
        return this.deck;
    }

    public int getRoundNumber() {
        return this.roundNumber;
    }

    public int getHandSize() {
        return this.handSize;
    }

    public int getRoundsTotal() {
        return this.roundsTotal;
    }
}
