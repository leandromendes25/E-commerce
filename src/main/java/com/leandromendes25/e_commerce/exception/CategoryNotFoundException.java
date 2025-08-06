package com.leandromendes25.e_commerce.exception;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException() {
        super("Categoria não encontrada");
    }
}
