package com.leandromendes25.e_commerce.dto.request;

import com.leandromendes25.e_commerce.model.CartItem;
import com.leandromendes25.e_commerce.model.User;

import java.math.BigDecimal;
import java.util.List;

public record CartRequestDTO(List<CartItem> items, User user) {
}
