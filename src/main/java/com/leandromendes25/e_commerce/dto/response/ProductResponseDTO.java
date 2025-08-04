package com.leandromendes25.e_commerce.dto.response;

import java.math.BigDecimal;
import java.util.List;

public record ProductResponseDTO(String name, BigDecimal price, List<String> image, int stockQty) {
}
