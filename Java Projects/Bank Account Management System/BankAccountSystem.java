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
