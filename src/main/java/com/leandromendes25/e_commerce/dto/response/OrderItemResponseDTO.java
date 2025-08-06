package com.leandromendes25.e_commerce.dto.response;

import com.leandromendes25.e_commerce.model.Order;
import com.leandromendes25.e_commerce.model.Product;

import java.math.BigDecimal;

public record OrderItemResponseDTO(Order order, Product product, Integer qty, BigDecimal subtotal) {
}
