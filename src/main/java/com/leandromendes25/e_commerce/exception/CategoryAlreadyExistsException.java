package com.leandromendes25.e_commerce.exception;

public class CategoryAlreadyExistsException extends RuntimeException {
    public CategoryAlreadyExistsException() {
        super("Categoria já cadastrada");
    }
}
