package com.models;

import java.util.*;

public class Deck {

    /* Attributes */

    final private List<Card> cards = new ArrayList<>();
    private int count_cards;

    /* Constructor */

    public Deck() {
        for (Card.Suit suit : Card.Suit.values()) {
            this.cards.add(new Card("Ace of " + suit.name(), 1, suit));
            this.cards.add(new Card("Two of " + suit.name(), 2, suit));
            this.cards.add(new Card("Three of " + suit.name(), 3, suit));
            this.cards.add(new Card("Four of " + suit.name(), 4, suit));
            this.cards.add(new Card("Five of " + suit.name(), 5, suit));
            this.cards.add(new Card("Six of " + suit.name(), 6, suit));
            this.cards.add(new Card("Seven of " + suit.name(), 7, suit));
            this.cards.add(new Card("Jack of " + suit.name(), 8, suit));
            this.cards.add(new Card("Knight of " + suit.name(), 9, suit));
            this.cards.add(new Card("King of " + suit.name(), 10, suit));
        }
        this.count_cards = 40;
    }

    /* Getters */

    public List<Card> getCards() {
        return this.cards;
    }

    public int getCountCards() {
        return this.count_cards;
    }

    /* Methods */

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card draw() {
        if (this.count_cards == 0) return null;
        this.count_cards--;
        return this.cards.removeFirst();
    }
}
