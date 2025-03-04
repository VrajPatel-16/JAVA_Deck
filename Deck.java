// Deck.java
// Handles creating, shuffling, dealing, and searching cards

import java.util.ArrayList;
import java.util.Collections;

class Deck {
    private ArrayList<Card> cardDeck;

    // Constructor: Creates and initializes the deck
    public Deck() {
        cardDeck = new ArrayList<>();
        createDeck();
    }
