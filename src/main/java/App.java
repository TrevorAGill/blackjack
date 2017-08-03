import models.Blackjack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/3/17.
 */
public class App {
    Blackjack newGame = new Blackjack();
    List someList = newGame.createDeck(); //needs blackjack object to run!
    List hand = newGame.hand(someList);
//    hand(someList);

}
