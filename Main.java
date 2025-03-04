// Main.java

// Name: Vraj Patel
// PRN: 23070126147
// Batch: AIML-B3

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;

        do {
            // Display menu
            System.out.println("\n Card Game Menu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Print Specific Card");
            System.out.println("4. Find Cards of Same Suit");
            System.out.println("5. Compare Two Cards");
            System.out.println("6. Search for a Card");
            System.out.println("7. Deal 5 Random Cards");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;

                case 2:
                    deck.shuffleDeck();
                    break;

                case 3:
                    System.out.print("Enter card index (0-51): ");
                    deck.printCard(scanner.nextInt());
                    break;

                case 4:
                    System.out.print("Enter suit to search (Spades/Hearts/Diamonds/Clubs): ");
                    deck.sameCard(scanner.nextLine());
                    break;

                case 5:
                    System.out.print("Enter first card index: ");
                    int index1 = scanner.nextInt();
                    System.out.print("Enter second card index: ");
                    int index2 = scanner.nextInt();
                    deck.compareCard(index1, index2);
                    break;

                case 6:
                    System.out.print("Enter Rank (2-10, J, Q, K, A): ");
                    String rank = scanner.next();
                    System.out.print("Enter Suit (Spades/Hearts/Diamonds/Clubs): ");
                    String suit = scanner.next();
                    deck.findCard(rank, suit);
                    break;

                case 7:
                    deck.dealCard();
                    break;
            }
        } while (choice != 8);

        System.out.println(" Program Terminated.");
    }
}