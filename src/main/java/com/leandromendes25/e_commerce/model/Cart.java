package com.leandromendes25.e_commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity(name = "tb_cart")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> items;
    private BigDecimal totalPrice;
    @JoinColumn(name = "user_id")
    private User userentity;

    public BigDecimal getTotalPrice(BigDecimal subTotal) {
        BigDecimal total = BigDecimal.ZERO;
        for (CartItem x : items) {
            total = total.add(x.getSubtotal());
        }
        return total;
    }
}