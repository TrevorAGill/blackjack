import models.Blackjack;
import org.junit.Test;

import java.util.ArrayList;

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
//        String firstCard = "2 of Club";
        assertNotEquals("2 of Club", newGame.createDeck().get(0));
    }
}