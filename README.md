# 🃏 Java Deck of Cards Program

## 📌 Description
This Java-based program simulates a **deck of 52 playing cards** with various operations:
- **Creating and displaying the deck**
- **Shuffling the deck**
- **Selecting random cards**
- **Finding and comparing cards**
- **Dealing cards to players**

The program follows **Java best practices**, including:
- **PascalCase** for class names.
- **camelCase** for method names.
- **snake_case** for variable names.

---

## 🚀 Features
- **Create and display a full deck** of 52 cards.
- **Shuffle the deck** to randomize the order.
- **Find, compare, and deal cards** to players.
- **Search for a specific card** in the deck.
- **Compare two cards** based on their rank.

---

## 🛠️ File Structure

### 📄 `Card.java`
**Purpose:**  
- Represents a **single playing card** with a **rank** and **suit**.

**Methods:**
1. **`Card(String rank, String suit)`**  
   - Constructor to initialize a card with a **rank** and **suit**.

2. **`String toString()`**  
   - Returns the **formatted card description** (e.g., `"Ace of Spades"`).

---

### 📄 `Deck.java`
**Purpose:**  
- Manages the **deck of 52 cards** and implements various operations.

**Methods:**
1. **`void createDeck()`**  
   - Creates a **deck of 52 cards** with **4 suits** and **13 ranks**.

2. **`void displayDeck()`**  
   - Prints the **entire deck** in its current order.

3. **`void shuffleDeck()`**  
   - Randomizes the **order of cards**.

4. **`void randomCards()`**  
   - Selects **two random cards** from the deck.

5. **`void dealCards(int numPlayers, int numCards)`**  
   - Deals **5 random cards** to **each player**.

6. **`void findCard(String rank, String suit)`**  
   - Searches for a **specific card** in the deck.

7. **`void compareCard(Card card1, Card card2)`**  
   - Compares **two cards** based on their rank.

---

### 📄 `Main.java`
**Purpose:**  
- Serves as the **entry point** for the program.
- Displays a **menu** for different deck operations.

**Key Functionalities:**
- **Creates a deck** and shuffles it.
- **Deals cards** to players.
- **Finds and compares specific cards**.

---

