package com.itacademy.java.oop.basics.task3;

public class NotEnoughCreditException extends Exception {
    private String message;

    public NotEnoughCreditException(String msg) {
        this.message = msg;

    }

    @Override
    public String getMessage() {
        return message;
    }
}
