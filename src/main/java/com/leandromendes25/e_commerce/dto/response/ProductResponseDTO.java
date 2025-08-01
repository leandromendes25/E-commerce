package com.leandromendes25.e_commerce.dto.response;

import java.math.BigDecimal;

public record ProductResponseDTO(String name, BigDecimal price, String image, int stockQty) {
}
