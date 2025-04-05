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

- **Expense**: A class representing a single expense entry with attributes: `category`, `amount`, and `date`.
- **ExpenseTracker**: The main class that manages expenses, including adding new expenses, saving them to a file, and displaying the list of expenses.

---

## 📚 Code Explanation

### **Expense.java**:
Represents an expense entry with a category, amount, and date. The class also includes a `toString` method to format the expense in a readable manner.

### **ExpenseTracker.java**:
Contains the main logic for adding, displaying, and saving expenses:
- `addExpense(String category, double amount, String date)`: Adds a new expense and saves it to the list.
- `saveExpensesToFile()`: Saves all recorded expenses to a file (`expenses.txt`).
- `showExpenses()`: Displays all recorded expenses to the user.

---

## ⚙️ How It Works

1. **💳 Adding an Expense**: 
   When you add an expense, it is stored in a list and saved to a file. Each expense consists of a category, amount, and the date when the expense occurred.

2. **💾 Saving to File**: 
   All the expenses are written to a file (`expenses.txt`) using a `BufferedWriter` so that the data is persistent between application runs.

3. **📑 Displaying Expenses**:
   The expenses are printed in a readable format: `Date | Category | Amount`.

---

## 📝 Example Usage

### **1. Add Expense**:
The following expenses are added in the main method:
- **🍞 Groceries**: $50.75 on `2025-03-29`
- **🚗 Transport**: $15.00 on `2025-03-29`

### **2. Display Expenses**:
After adding the expenses, they are displayed like this:

Expense List: 2025-03-29 | 🍞 Groceries | $50.75 2025-03-29 | 🚗 Transport | $15.00

yaml
Copy
Edit

---

## 🏃‍♂️ How to Run

### 1. 🖥 Compile the Code:
To compile the Java files, use the following command:
```bash
javac ExpenseTracker.java
2. ▶️ Run the Program:
After compiling, run the program using:

bash
Copy
Edit
java ExpenseTracker
3. 📂 File Output:
The application will generate a file named expenses.txt containing all expenses in the following format:

bash
Copy
Edit
2025-03-29 | 🍞 Groceries | $50.75
2025-03-29 | 🚗 Transport | $15.00
