package com.leandromendes25.e_commerce.exception;

public class EmailAlreadyRegistered extends RuntimeException {
    public EmailAlreadyRegistered() {
        super("Email já cadastrado");
    }
}
