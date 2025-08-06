package com.leandromendes25.e_commerce.dto.request;

import com.leandromendes25.e_commerce.model.Order;
import com.leandromendes25.e_commerce.model.Product;

public record OrderItemRequestDTO(Order order, Product product, Integer qty) {
}
