package com.leandromendes25.e_commerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private User userId;
    private List<CartItem> items;
    private BigDecimal totalPrice;

    public BigDecimal getTotalPrice(BigDecimal subTotal) {
        BigDecimal total = BigDecimal.ZERO;
        for (CartItem x : items) {
            total.add(x.getSubtotal());
        }
        return total;
    }
}
