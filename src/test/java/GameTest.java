import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    private ArrayList<Player> players;

    @Before
    public void Before(){
        players = new ArrayList<Player>();
        Player player1 = new Player("Ryan");
        Player player2 = new Player("Jessica");
        players.add(player1);
        players.add(player2);
        game = new Game(players, 2, 2);
    }

    @Test
    public void hasPlayers(){
        assertEquals(2, game.getPlayerCount());
    }

    @Test
    public void hasDeck(){
        assertEquals(52, game.getDeck().countCards());
    }

    @Test
    public void hasRoundNumber(){
        assertEquals(0, game.getRoundNumber() );
    }

    @Test
    public void hasHandSize(){
        assertEquals(2, game.getHandSize());
    }

    @Test
    public void hasRoundsTotal(){
        assertEquals(2, game.getRoundsTotal());
    }

    

}
