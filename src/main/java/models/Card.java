//package models;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
///**
// * Created by Guest on 8/3/17.
// */
//public class Card {
//    public String number;
//    public String suit;
//    public int value;
//
//    public Card(String number, String suit, int value) {
//        this.number = number;
//        this.suit = suit;
//        this.value = value;
//    }
//
//    public List createDeck() {
//        List<Card> deck = new ArrayList<>();
//
//        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
//        String[] suits = {"Club", "Spade", "Heart", "Diamond"};
//        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
//
//        for (int i=0 ; i < numbers.length ; i++) {
//            for (int j=0 ; j < suits.length ; j++) {
//                Card newCard = new Card(number[i], suit[j], value);
//                deck.add(newCard);
//            }
//        }
//        Collections.shuffle(deck);
//        return deck;
//    }
//}
