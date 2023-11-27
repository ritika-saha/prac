//package day7;

import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
            System.out.println("Debit successful. Remaining balance: $" + balance);
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();

        Account account = new Account(initialBalance);

        System.out.print("Enter debit amount: $");
        double debitAmount = scanner.nextDouble();

        account.debit(debitAmount);

        System.out.println("Final balance: $" + account.getBalance());
    }
}

