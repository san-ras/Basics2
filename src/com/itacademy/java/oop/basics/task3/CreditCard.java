package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card {

    private double interest;
    final double credit;

    public CreditCard(double credit, double balance, String cardHolderName, String cardNumber, double interest) {
        super(balance, cardHolderName, cardNumber);
        this.credit = credit;
        this.interest = interest;
    }

    @Override
    public void credit(double amount) throws NotEnoughCreditException {
        double possibleAmount = balance + credit - (amount * interest / 100);
        double fullCreditingAmount = amount + amount * interest / 100;
        if (possibleAmount >= fullCreditingAmount) {
            balance = balance - fullCreditingAmount;
            System.out.println("The amount " + amount + " has been withdrawn. Balance: " + balance);
        } else {
            throw new NotEnoughCreditException("ERROR: Not enough credit; your balance is " + balance + ", maximum allowed withdrawal is " + possibleAmount);
        }
    }

    @Override
    public void debit(double amount) {
        balance = balance + amount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getCredit() {
        return credit;
    }
}
