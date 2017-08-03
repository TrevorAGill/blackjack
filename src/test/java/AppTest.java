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
}