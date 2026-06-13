import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(int accountNumber, String accountHolderName,
                   double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Amount: " + calculateInterest());
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolderName,
                   double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        SavingsAccount s1 =
                new SavingsAccount(101, "Ariyan", 5000, 5);

        CurrentAccount c1 =
                new CurrentAccount(201, "Rahim", 3000, 2000);

        s1.deposit(1000);
        s1.withdraw(2000);

        c1.deposit(1000);
        c1.withdraw(4500);

        System.out.println("\n===== Savings Account =====");
        s1.displayAccountInfo();

        System.out.println("\n===== Current Account =====");
        c1.displayAccountInfo();
    }
}