package com.bz.Exceptions;

public class InvalidFirstNameException extends RuntimeException{
    public InvalidFirstNameException(String message)
    {
        super(message);
    }
}
