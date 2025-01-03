package com.models;

import java.security.InvalidParameterException;

public class Card {

    /* Enumeration for the suit of the card */

    public enum Suit {
        CLUBS,
        SWORDS,
        CUPS,
        COINS
    }

    /* Attributes */

    final private String name;
    final private int value;
    final private Suit suit;

    /* Constructor */

    public Card(String name, int value, Suit suit) {
        this.name = name;
        if (value <= 0 || value > 10) throw new InvalidParameterException("The given value is not valid. It has to be in the range [0, 10]");
        this.value = value;
        this.suit = suit;
    }

    /* Getters */

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }
}
