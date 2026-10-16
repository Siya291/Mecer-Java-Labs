package org.labs1to6;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void getBalance() {
        deposit(2000);
        withdraw(700);

    }

    void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited R" + amount + " into " + accountHolder + "'s account, available balance is R" + balance);
        }

    }

    void withdraw(double amount) {
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrew R" + amount + " in account number " + accountNumber + " available balance is R" + balance);
        } else {
            System.out.print("Invalid withdrwal");
        }
    }
}
