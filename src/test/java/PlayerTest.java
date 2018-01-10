import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;

    @Before
    public void Before(){
        player = new Player("Trevor");
    }

    @Test
    public void hasName(){
        assertEquals("Trevor", player.getName());
    }

    @Test
    public void hasPointsTotal(){
        assertEquals(0, player.getPointsTotal());
    }

    @Test
    public void hasListOfCards(){
        assertEquals(0, player.getCardCount());
    }

    @Test
    public void hasHandTotal(){
        assertEquals(0, player.getHandTotal());
    }

}
