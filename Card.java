// Card.java
// Defines a Card class with rank and suit attributes

class Card {
    private String rank;
    private String suit;

    // Constructor to initialize a card
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getter methods
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
