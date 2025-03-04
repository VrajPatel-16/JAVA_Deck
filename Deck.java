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

    // Creates a deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        for (String rank : ranks) {
            for (String suit : suits) {
                cardDeck.add(new Card(rank, suit));
            }
        }
    }

    // Prints all cards in the deck
    public void printDeck() {
        System.out.println("\n📜 Current Deck:");
        for (Card card : cardDeck) {
            System.out.println(card);
        }
    }