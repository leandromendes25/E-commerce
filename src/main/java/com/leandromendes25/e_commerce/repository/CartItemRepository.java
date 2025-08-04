package com.leandromendes25.e_commerce.repository;

import com.leandromendes25.e_commerce.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
