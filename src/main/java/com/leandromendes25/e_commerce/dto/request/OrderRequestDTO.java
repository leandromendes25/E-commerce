package com.leandromendes25.e_commerce.dto.request;

import com.leandromendes25.e_commerce.model.OrderItem;
import com.leandromendes25.e_commerce.model.User;
import com.leandromendes25.e_commerce.model.enums.OrderStatus;

import java.util.List;

public record OrderRequestDTO(Long idUser, List<OrderItemRequestDTO> items, OrderStatus status, String paymentId) {
}
