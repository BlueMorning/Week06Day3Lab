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

    public ArrayList<Player> getPlayers(){
        return this.players;
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

    public void whoWinsTheRound(){
        int winnerIndex = 0;
        int maxResult   = 0;

        for (int i = 0; i < getPlayers().size(); i++){
            Player player = players.get(i);
            if (player.calculateHandTotal() > maxResult){
                maxResult = player.calculateHandTotal();
                winnerIndex = i;
            }
        }

        players.get(winnerIndex).addPoint();

        for (int i = 0; i < getPlayers().size(); i++){
            Player player = players.get(i);

            if (i != winnerIndex && player.calculateHandTotal() == maxResult){
                players.get(i).addPoint();
            }
        }


    }

    public ArrayList<Player> whoWinsTheGame(){

        ArrayList<Player> winners = new ArrayList<>();

        int winnerIndex = 0;
        int maxResult   = 0;

        for (int i = 0; i < getPlayers().size(); i++){
            Player player = players.get(i);

            if (player.getPointsTotal() > maxResult){
                maxResult = player.getPointsTotal();
                winnerIndex = i;
            }
        }

        winners.add(players.get(winnerIndex));

        for (int i = 0; i < getPlayers().size(); i++){
            Player player = players.get(i);

            if (i != winnerIndex && player.getPointsTotal() == maxResult){
                winners.add(player);
            }
        }

        return winners;
    }

    public void incrementRoundNumber(){
        roundNumber+=1;
    }

}
