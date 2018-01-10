import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
    public void testAllGame(){
        dealer.createGame(players, 6, 2);
        ArrayList<Player> winners = dealer.playWholeGame();

        for(Player player: winners){
            System.out.println(player.getName()+"="+player.getPointsTotal());
        }

    }

}
