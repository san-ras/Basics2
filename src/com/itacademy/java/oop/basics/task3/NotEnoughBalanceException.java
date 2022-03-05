package com.itacademy.java.oop.basics.task3;

public class NotEnoughBalanceException extends Exception {
    private String message;

    public NotEnoughBalanceException(String msg) {
        this.message = msg;

    }

    @Override
    public String getMessage() {
        return message;
    }

}
