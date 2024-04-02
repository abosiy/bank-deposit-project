package com.bosiy;

public class BankAccount {

    private static final double COMMISSION = 3.5;
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

    public boolean isNegative(double value) {
        return value <= 0;
    }

    public void deposit(double value) {
        if (isNegative(value)) {
            System.out.println("This operation haven't sense");
            return;
        }

        this.balance += value;
        System.out.println("Your balance: " + this.balance);
    }

    public void withdraw(double value) {
        if (isNegative(value)) {
            System.out.println("This operation haven't sense");
            return;
        }
        if (value > this.balance) {
            System.out.println("Your balance is low!");
            return;
        }
        this.balance -= value;
        System.out.println("Your balance: " + this.balance);
    }

    public void transferTo(double value, BankAccount receiver) {
        double transactionCost = value - COMMISSION;

        if (this.balance >= transactionCost) {
            this.balance -= transactionCost;

            double receiverBalance = receiver.getBalance();
            receiver.setBalance(receiverBalance + value);
        }
        System.out.println("Transfer from: " + accountHolder + ";\nTransfer to: "
                + receiver.accountHolder + "; ");
    }

    @Override
    public String toString() {
        return "Account number: " + this.accountNumber + ";\nAccount holder: "
                + this.accountHolder + ";\nBalance: " + this.balance + ";\n";
    }
}
