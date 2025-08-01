package com.leandromendes25.e_commerce.model.enums;

public enum UserRole {
    ADMIN("admin"), USER("user");
    private String userType;

    UserRole(String userType) {
        this.userType = userType;
    }
}