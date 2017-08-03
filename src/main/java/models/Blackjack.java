package models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Guest on 8/3/17.
 */
public class Blackjack {



    public List createDeck() {
        List deck = new ArrayList<String>();

        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Club", "Spade", "Heart", "Diamond"};
        for (String number : numbers) {
            for (String suit : suits) {
                String card = number + " of " + suit;
                deck.add(card);
            }
        }
        Collections.shuffle(deck);
        return deck;
    }


    public List hand(List someList) {
//        ArrayList<String> hand = new ArrayList<>();
        List hand = someList.subList(0,1);
        someList.remove(0);
        someList.remove(1);
        return someList;
    }

}
