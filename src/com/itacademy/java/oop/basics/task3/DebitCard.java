package com.itacademy.java.oop.basics.task3;

public class DebitCard extends Card {

    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
    }

    @Override
    public void credit(double amount) throws NotEnoughBalanceException {
        if (getBalance() >= amount) {
            balance = balance - amount;
            System.out.println("The amount " + amount + " has been withdrawn. Balance: " + balance);
        } else {
            throw new NotEnoughBalanceException("ERROR: Not enough money in account; total balance is " + balance + ", amount requested " + amount);
        }
    }

    @Override
    public void debit(double amount) {
        balance = balance + amount;
    }

}
