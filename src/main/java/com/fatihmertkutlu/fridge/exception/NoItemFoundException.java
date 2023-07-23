package com.fatihmertkutlu.fridge.exception;

public class NoItemFoundException extends NestedException {

    public static final String ERROR_CODE = "noItemFound";

    public NoItemFoundException(String message) {
        super(message);
    }

    @Override
    public String getErrorCode() {
        return ERROR_CODE;
    }

}