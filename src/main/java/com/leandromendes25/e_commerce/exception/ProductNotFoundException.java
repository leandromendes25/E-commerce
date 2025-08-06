package com.leandromendes25.e_commerce.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException() {
        super("Produto não encontrado");
    }
}
