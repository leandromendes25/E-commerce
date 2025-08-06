package com.leandromendes25.e_commerce.exception;

public class EmailAlreadyRegisteredException extends RuntimeException {
    public EmailAlreadyRegisteredException() {
        super("Email já cadastrado");
    }
}
