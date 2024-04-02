package com.bosiy;

public class MainApplication {
    public static void main(String[] args) {

        // transfer

        BankAccount jones = new BankAccount("050912",
                "Frank Jones", 5000);
        BankAccount bradley = new BankAccount("089912",
                "Harry Bradley", 1200);
        BankAccount king = new BankAccount("034412",
                "Owen King", 900);

        System.out.println(jones);
        System.out.println(bradley);
        System.out.println(king);

        jones.deposit(123);
        jones.deposit(100);

        jones.withdraw(1000);
        jones.withdraw(500);

        System.out.println();

        jones.transferTo(3000, bradley);

        System.out.println();

        System.out.println(jones);
        System.out.println(bradley);

    }
}
