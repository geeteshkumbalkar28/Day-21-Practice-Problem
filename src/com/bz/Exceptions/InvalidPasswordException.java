package com.bz.Exceptions;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String message)
    {
        super(message);
    }
}

