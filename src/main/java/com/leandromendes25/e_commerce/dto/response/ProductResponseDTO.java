package com.leandromendes25.e_commerce.dto.response;

import com.leandromendes25.e_commerce.model.Category;

import java.math.BigDecimal;
import java.util.List;

public record ProductResponseDTO(Long id, String name, BigDecimal price, String image, int stockQty, Category category) {
}
