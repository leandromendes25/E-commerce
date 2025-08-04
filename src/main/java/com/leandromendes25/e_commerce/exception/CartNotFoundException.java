package com.leandromendes25.e_commerce.exception;

public class CartNotFoundException extends RuntimeException {
    public CartNotFoundException() {
        super("Carrinho não encontrado");
    }
}
