package com.leandromendes25.e_commerce.dto.request;

import com.leandromendes25.e_commerce.model.enums.UserRole;

public record UserRequestDTO(String email, String password, UserRole role) {
}