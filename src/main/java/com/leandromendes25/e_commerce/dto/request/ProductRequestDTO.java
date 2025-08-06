package com.leandromendes25.e_commerce.dto.request;

import java.math.BigDecimal;

public record ProductRequestDTO(String name, BigDecimal price, String image, int stockQty, Long categoryId) {
}
