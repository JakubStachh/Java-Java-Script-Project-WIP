# Bank Account System

## 📝 **Overview**

This Java program simulates a simple bank account system. It allows the creation of accounts, deposits, withdrawals, and balance checks. Each account has a unique account number, and users can perform transactions such as deposit and withdrawal.

---

## 💡 **Features**

- **Account Creation**: Allows creating accounts with an initial balance.
- **Deposit**: Deposits money into an account, ensuring the deposit amount is positive.
- **Withdrawal**: Withdraws money from an account, ensuring sufficient balance exists.
- **Balance Check**: Displays the account holder's name and current balance.
- **Account Identification**: Every account is associated with a unique account number, which increments automatically.

---

## ⚙️ **How It Works**

### **1. Account Creation**:
The system allows you to create an account by specifying the account holder's name and an initial balance. Each account is associated with a unique account number starting from 1001.

### **2. Deposit**:
You can deposit a positive amount into an account. If the deposit amount is negative or zero, the system will reject it.

### **3. Withdrawal**:
You can withdraw money from the account. If there are insufficient funds, the system will show an error message. Otherwise, it will deduct the amount from the balance.

### **4. Balance Check**:
You can check the current balance and details of the account holder by calling the `showBalance()` method.

---

## 📜 **Code Explanation**

### **Account Class**:
The `Account` class represents a bank account with the following methods:
- `deposit(double amount)`: Deposits the specified amount into the account.
- `withdraw(double amount)`: Withdraws the specified amount from the account, checking for sufficient balance.
- `showBalance()`: Displays the account holder's name and the current balance.

### **BankAccountSystem Class**:
The `BankAccountSystem` class manages multiple bank accounts, providing methods to create accounts and retrieve accounts by account number.

### **Main Method**:
The main method demonstrates the functionality of the system. It creates two accounts, deposits money, withdraws money, and then displays the balance.

---

## 🧑‍💻 **Code**:

```java
import java.util.*;

class Account {
    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    public void showBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountSystem {
    private static Map<Integer, Account> accounts = new HashMap<>();
    private static int accountNumberCounter = 1001;

    public static void createAccount(String accountHolder, double initialBalance) {
        Account account = new Account(accountHolder, initialBalance);
        accounts.put(accountNumberCounter++, account);
    }

    public static Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public static void main(String[] args) {
        createAccount("John Doe", 5000);
        createAccount("Jane Smith", 3000);

        Account johnAccount = getAccount(1001);
        johnAccount.deposit(1500);
        johnAccount.withdraw(2000);
        johnAccount.showBalance();
    }
}
```

---
## 🖼️ Sample Output:
```yaml
Deposited: 1500.0
Withdrew: 2000.0
Account Holder: John Doe
Balance: 4500.0
```
