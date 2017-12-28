package io.janezhango.enums;

/**
 * Created by xiaojing on 12/28/2017.
 */
public class Card {
    public enum Suit {HEART, DIAMOND, CLUB, SPADE};
    public enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
        EIGHT, NINE, TEN, JACK, QUEEN, KING};

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }
    public String toString() {
        return rank + " of " + suit;
    }

    public static void main(String... args) {
        Card upMySleeve = new Card(Suit.HEART, Rank.ACE);
        System.out.println("what is up my sleeve? " + upMySleeve);
        // outputs: what is up my sleeve? ACE of HEART
    }

}
