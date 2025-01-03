package com.models;

import java.util.*;

public class Player {

    /* Attributes */

    final private String name;
    final private List<Card> hand = new ArrayList<>();
    private int points;

    /* Constructor */

    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    /* Getters */

    public int getPoints() {
        return this.points;
    }

    public String getName() {
        return this.name;
    }

    public List<Card> getHand() {
        return this.hand;
    }

    /* Methods */

    public void addPoints(int points) {
        this.points += points;
    }

    public void addCardToHand(Card card) {
        this.hand.add(card);
    }

    public void removeCardFromHand(Card card) {
        this.hand.remove(card);
    }
}
