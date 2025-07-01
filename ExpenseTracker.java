import java.util.*;

public class ExpenseTracker {
    private static ArrayList<Expense> expenses = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    // ANSI color codes
public static final String RESET = "\u001B[0m";
public static final String GREEN = "\u001B[32m";
public static final String RED = "\u001B[31m";
public static final String CYAN = "\u001B[36m";
public static final String YELLOW = "\u001B[33m";


    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=============================");
System.out.println(CYAN + "    EXPENSE TRACKER MENU" + RESET);
System.out.println("=============================");
System.out.println(YELLOW + "1. Add Expense" + RESET);
System.out.println(YELLOW + "2. View Expenses" + RESET);
System.out.println(YELLOW + "3. Delete Expense" + RESET);
System.out.println(YELLOW + "4. Total Spending" + RESET);
System.out.println(YELLOW + "5. Exit" + RESET);
System.out.println("=============================");
System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1 -> addExpense();
                case 2 -> viewExpenses();
                case 3 -> deleteExpense();
                case 4 -> totalSpending();
                case 5 -> {
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addExpense() {
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter category (Food, Transport, Shopping, etc.): ");
        String category = scanner.nextLine();
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        try {
            System.out.print("Processing");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500); // 500ms delay
                System.out.print(".");
            }
            System.out.println(" Done!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        expenses.add(new Expense(amount, category, date, description));
        System.out.println(GREEN + "✔ Expense added successfully!" + RESET);
    }

    private static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        System.out.printf("%-12s %-10s %-10s %s\n", RED+"Date", "Category", "Amount", "Description"+RESET);
System.out.println("------------------------------------------------------");

for (Expense expense : expenses) {
    System.out.printf("%-12s %-10s ₹%-9.2f %s\n",
        expense.getDate(), expense.getCategory(), expense.getAmount(), expense.getDescription());
}

    }

    private static void deleteExpense() {
        viewExpenses();
        if (expenses.isEmpty()) return;

        System.out.print("Enter expense index to delete: ");
        int index = scanner.nextInt();
        try {
            System.out.print("Processing");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500); // 500ms delay
                System.out.print(".");
            }
            System.out.println(" Done!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        if (index > 0 && index <= expenses.size()) {
            expenses.remove(index - 1);
            System.out.println("✅ Expense deleted.");
        } else {
            System.out.println("❌ Invalid index.");
        }
    }

    private static void totalSpending() {
        double total = 0;
        for (Expense exp : expenses) {
            total += exp.getAmount();
        }
        System.out.println("💰 Total Spending: ₹" + total);
    }
}

