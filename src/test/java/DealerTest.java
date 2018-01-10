import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Player player1;
    Player player2;
    Player player3;
    ArrayList<Player> players;

    @Before
    public void Before(){
        dealer = new Dealer();
        player1 = new Player("Batman");
        player2 = new Player("Superwoman");
        player3 = new Player("Joe Bloggs");
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

    }


    @Test
    public void playRound(){

        dealer.createGame(players, 6, 2);
        dealer.playRound();

        assertEquals(0, players.get(0).getCardCount());
        assertEquals(0, players.get(1).getCardCount());
        assertEquals(0, players.get(2).getCardCount());

        int sumOfThePointsForAllPlayers = players.get(0).getPointsTotal()
                                        + players.get(1).getPointsTotal()
                                        + players.get(2).getPointsTotal();

        assertEquals(true, sumOfThePointsForAllPlayers >= 1 && sumOfThePointsForAllPlayers <= 3 );
    }


    @Test
    public void testAllGame(){

        dealer.createGame(players, 6, 2);
        ArrayList<Player> winners = dealer.playWholeGame();

        int sumOfThePointsForAllPlayers = players.get(0).getPointsTotal()
                                        + players.get(1).getPointsTotal()
                                        + players.get(2).getPointsTotal();


        assertEquals(true, winners.size() >= 1 && winners.size() <= 3);
        // 3 players and 6 rounds mean at least 6 points when no draws and a maximum of 18 points 6 draws occur
        assertEquals(true, sumOfThePointsForAllPlayers >= 6 && sumOfThePointsForAllPlayers <= 18);

    }

}
