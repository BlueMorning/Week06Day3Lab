import java.util.ArrayList;

public class Dealer {

    private Game game;

    public Dealer(){
    }

    public void createGame(ArrayList<Player> players, int roundsTotal, int handSize){
        game = new Game(players, roundsTotal, handSize);
    }

    public void playRound(){
        if (game.getRoundNumber() < game.getRoundsTotal()){
            for (Player player: game.getPlayers()){
                for (int i = 0 ; i<game.getHandSize(); i++){
                    player.addCard(game.getDeck().removeCard());
                }

            }
            game.whoWinsTheRound();
            for (Player player: game.getPlayers()){
                player.removeCards();
            }

        }

    }

    public ArrayList<Player> playWholeGame(){
        for (int i = 0; i < game.getRoundsTotal(); i++){
            playRound();
        }

        return game.whoWinsTheGame();
    }


}
