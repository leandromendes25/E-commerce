package com.leandromendes25.e_commerce.dto.request;

import com.leandromendes25.e_commerce.model.CartItem;

import java.util.List;

public record CartRequestDTO(List<CartItemRequestDTO> items) {
}
