package com.itacademy.java.oop.basics.task3;

public class InsufficientAtmFundsException extends Exception {
    private String message;

    public InsufficientAtmFundsException(String msg) {
        this.message = msg;

    }

    @Override
    public String getMessage() {
        return message;
    }

}
