package com.bz.Exceptions;

public class InvalidEmailException extends RuntimeException{
    public InvalidEmailException(String message)
    {
        super(message);
    }
}
