package com.fatihmertkutlu.fridge.exception;

public abstract class NestedException extends Exception {

    NestedException(String message) {
        super(message);
    }

    public abstract String getErrorCode();

}