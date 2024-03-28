package com.bosiy;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double value) {
        this.balance += value;
        System.out.println("Your balance: " + this.balance);
    }

    public void withdraw(double value) {
        if (value > this.balance) {
            System.out.println("Your balance is low!");
            return;
        }
        this.balance -= value;
        System.out.println("Your balance: " + this.balance);
    }

    @Override
    public String toString() {
        return "Account number: " + this.accountNumber + ";\nAccount holder: " + this.accountHolder + ";\nBalance: " + this.balance + ";\n";
    }
}
