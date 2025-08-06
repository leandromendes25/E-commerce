package com.leandromendes25.e_commerce.dto.response;

import com.leandromendes25.e_commerce.model.Cart;
import com.leandromendes25.e_commerce.model.Product;

public record CartItemResponseDTO(Product product, Integer quantity, Cart cart) {
}
