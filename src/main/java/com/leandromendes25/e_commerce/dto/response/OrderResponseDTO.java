package com.leandromendes25.e_commerce.dto.response;

import com.leandromendes25.e_commerce.model.OrderItem;
import com.leandromendes25.e_commerce.model.User;
import com.leandromendes25.e_commerce.model.enums.OrderStatus;

import java.util.List;

public record OrderResponseDTO(User user, List<OrderItem> items, OrderStatus status, String paymentId) {
}
