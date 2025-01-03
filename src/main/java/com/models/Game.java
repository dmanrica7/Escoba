package com.models;

import java.util.*;

public class Game {

    /* Attributes */

    private final Deck deck;
    private final List<Player> players = new ArrayList<>();
    private final List<Card> table = new ArrayList<>();
    private final int targetValue = 15;

    /* Constructor */
    public Game(List<String> players) {
        this.deck = new Deck();
        for (String player : players) {
            this.players.add(new Player(player));
        }
    }

}
