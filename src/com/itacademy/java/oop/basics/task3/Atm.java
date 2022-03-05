package com.itacademy.java.oop.basics.task3;

public interface Atm {

    void withdraw(CreditCard creditCard) throws InsufficientAtmFundsException, NotEnoughCreditException;
    void withdraw(DebitCard debitCard) throws InsufficientAtmFundsException, NotEnoughBalanceException;

}
