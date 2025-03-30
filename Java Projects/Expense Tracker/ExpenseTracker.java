import java.io.*;
import java.util.*;

class Expense {
    private String category;
    private double amount;
    private String date;

    public Expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public String toString() {
        return date + " | " + category + " | $" + amount;
    }
}

public class ExpenseTracker {
    private static List<Expense> expenses = new ArrayList<>();
    private static final String FILE_NAME = "expenses.txt";

    public static void addExpense(String category, double amount, String date) {
        Expense expense = new Expense(category, amount, date);
        expenses.add(expense);
        saveExpensesToFile();
    }

    public static void saveExpensesToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Expense expense : expenses) {
                writer.write(expense.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving expenses.");
        }
    }

    public static void showExpenses() {
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    public static void main(String[] args) {
        addExpense("Groceries", 50.75, "2025-03-29");
        addExpense("Transport", 15.00, "2025-03-29");
        System.out.println("Expense List:");
        showExpenses();
    }
}
