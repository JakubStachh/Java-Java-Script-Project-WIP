# 🧾 Expense Tracker Application

## 📜 Overview

The Expense Tracker is a simple Java application that allows users to track their expenses. It stores the expense details such as the category, amount, and the date the expense occurred. Expenses are saved to a file (`expenses.txt`), and users can view all their recorded expenses.

---

## ✨ Features

- **💸 Add Expenses**: Users can add expenses with details such as category, amount, and date.
- **📊 Display Expenses**: View all recorded expenses in a formatted manner.
- **💾 Persistent Storage**: Expenses are saved to a file (`expenses.txt`), ensuring they persist even after the application closes.
  
---

## 🛠 Components

### **Expense.java**:
Represents an expense entry with a category, amount, and date. The class also includes a `toString` method to format the expense in a readable manner.

```java
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
ExpenseTracker.java:
Contains the main logic for adding, displaying, and saving expenses:

addExpense(String category, double amount, String date): Adds a new expense and saves it to the list.

saveExpensesToFile(): Saves all recorded expenses to a file (expenses.txt).

showExpenses(): Displays all recorded expenses to the user.

java
Copy
Edit
