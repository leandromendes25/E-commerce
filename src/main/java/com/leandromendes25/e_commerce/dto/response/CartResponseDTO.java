package com.leandromendes25.e_commerce.dto.response;

import com.leandromendes25.e_commerce.model.CartItem;
import com.leandromendes25.e_commerce.model.User;

import java.math.BigDecimal;
import java.util.List;

public record CartResponseDTO(List<CartItem> items, BigDecimal totalPrice, UserResponseDTO userentity) {
}
