import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void Before(){
        card = new Card(Suit.DIAMONDS, Rank.JACK);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.DIAMONDS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.JACK, card.getRank());
    }
}
