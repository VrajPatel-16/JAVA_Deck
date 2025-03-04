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