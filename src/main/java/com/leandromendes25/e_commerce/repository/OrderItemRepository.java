package com.leandromendes25.e_commerce.repository;

import com.leandromendes25.e_commerce.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
