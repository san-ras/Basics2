package com.itacademy.java.oop.basics.task3;

import java.util.Scanner;

public class MyBankAtm implements Atm {

    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(CreditCard creditCard) throws NotEnoughCreditException, InsufficientAtmFundsException {

        System.out.println("Please enter the amount to withdraw (using credit card)");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        if (balance >= amount) {
            try {
                creditCard.credit(amount);
            } catch (NotEnoughCreditException e) {
                System.out.println(e.getMessage());
            }
        } else {
            throw new InsufficientAtmFundsException("ERROR: Not enough money in ATM; maximum withdrawal amount is " + balance);
        }
    }


    @Override
    public void withdraw(DebitCard debitCard) throws NotEnoughBalanceException, InsufficientAtmFundsException {
        System.out.println("Please enter the amount to withdraw (using debit card)");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        if (balance >= amount) {
            try {
                debitCard.credit(amount);
            } catch (NotEnoughBalanceException e) {
                System.out.println(e.getMessage());
            }
        } else {
            throw new InsufficientAtmFundsException("ERROR: Not enough money in ATM; maximum withdrawal amount is " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
