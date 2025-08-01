package com.leandromendes25.e_commerce.dto.response;

import com.leandromendes25.e_commerce.model.enums.UserRole;

public record UserResponseDTO(String email, String password, UserRole role) {
}
