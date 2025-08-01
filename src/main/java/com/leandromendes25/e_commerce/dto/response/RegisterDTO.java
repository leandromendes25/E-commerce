package com.leandromendes25.e_commerce.dto.response;

import com.leandromendes25.e_commerce.model.enums.UserRole;
import jakarta.validation.constraints.Email;

public record RegisterDTO(@Email(message = "Insira um e-mail valido") String email, String password, UserRole role) {
}
