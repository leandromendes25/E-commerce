package com.leandromendes25.e_commerce.dto.request;

import java.math.BigDecimal;
import java.util.List;

public record ProductRequestDTO(String name, BigDecimal price, List<String> image, int stockQty) {
}
