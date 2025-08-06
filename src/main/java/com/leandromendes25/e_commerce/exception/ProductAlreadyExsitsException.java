package com.leandromendes25.e_commerce.exception;

public class ProductAlreadyExsitsException extends RuntimeException {
    public ProductAlreadyExsitsException() {
        super("Produto já cadastrado");
    }
}
