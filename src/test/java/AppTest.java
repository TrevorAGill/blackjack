import models.Blackjack;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/3/17.
 */
public class AppTest {
    @Test
    public void blackjack_InstantiateADeck() throws Exception {
        Blackjack newGame = new Blackjack();
        assertEquals(52, newGame.createDeck().size());
    }

    @Test
    public void blackjack_ShuffleADeck() throws Exception {
        Blackjack newGame = new Blackjack();
        assertNotEquals("2 of Club", newGame.createDeck().get(0));
    }
    @Test
    public void blackjack_Deal2Cards_() throws Exception    {
        Blackjack newGame = new Blackjack();
        assertEquals(newGame.hand().size(),2);
    }
}