package com.itacademy.java.oop.basics.task3;

public class AtmApplication {
    public static void main(String[] args) throws NotEnoughBalanceException, NotEnoughCreditException, InsufficientAtmFundsException {

        CreditCard creditCard = new CreditCard(500, -400, "Paulius Paulaitis", "0123 4567 8901 1234", 1);
        DebitCard debitCard = new DebitCard(100, "Tomas Tomaitis", "1234 5678 9012 3456");

        MyBankAtm myAtm = new MyBankAtm(1000);

        try {
            myAtm.withdraw(debitCard);
        } catch (InsufficientAtmFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            myAtm.withdraw(creditCard);
        } catch (InsufficientAtmFundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
