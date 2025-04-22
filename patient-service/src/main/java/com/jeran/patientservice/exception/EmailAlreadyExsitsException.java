package com.jeran.patientservice.exception;

public class EmailAlreadyExsitsException extends RuntimeException{
    public EmailAlreadyExsitsException(String message) { super(message);}
}
