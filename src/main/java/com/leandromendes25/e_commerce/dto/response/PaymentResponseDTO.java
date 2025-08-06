package com.leandromendes25.e_commerce.dto.response;

import com.leandromendes25.e_commerce.model.Order;

import java.time.LocalDateTime;

public record PaymentResponseDTO(Order order, String method, LocalDateTime createdAt, String externalId) {
}
