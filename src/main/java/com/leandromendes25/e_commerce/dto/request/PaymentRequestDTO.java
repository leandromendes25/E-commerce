package com.leandromendes25.e_commerce.dto.request;

import com.leandromendes25.e_commerce.model.Order;

import java.time.LocalDateTime;

public record PaymentRequestDTO(Order order, String method, LocalDateTime createdAt, String externalId) {
}
