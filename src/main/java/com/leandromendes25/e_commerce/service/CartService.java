package com.leandromendes25.e_commerce.service;

import com.leandromendes25.e_commerce.dto.request.CartRequestDTO;
import com.leandromendes25.e_commerce.dto.response.CartResponseDTO;
import com.leandromendes25.e_commerce.exception.ProductNotFoundException;
import com.leandromendes25.e_commerce.mapper.CartMapper;
import com.leandromendes25.e_commerce.model.Cart;
import com.leandromendes25.e_commerce.model.CartItem;
import com.leandromendes25.e_commerce.model.Product;
import com.leandromendes25.e_commerce.model.User;
import com.leandromendes25.e_commerce.repository.CartRepository;
import com.leandromendes25.e_commerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepo;

    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private ProductRepository productRepository;

    public CartResponseDTO newCart(CartRequestDTO data) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Cart cart = cartMapper.toCart(data);
        List<CartItem> items = data.items().stream().map(itemDto -> {
            Product product = productRepository.findById(itemDto.productId()).orElseThrow(ProductNotFoundException::new);
            CartItem cartItem = new CartItem();
            cartItem.setProduct(product);
            cartItem.setQuantity(itemDto.quantity());
            cartItem.setCart(cart);
            return cartItem;
        }).toList();

        BigDecimal total = items.stream().map(item -> item.getProduct().getPrice().multiply(BigDecimal.valueOf(item.getQuantity()))).reduce(BigDecimal.ZERO, BigDecimal::add);
        cart.setTotalPrice(total);
        cart.setUserentity(user);
        cart.setItems(items);
        var cat = cartRepo.save(cart);
        System.out.println(cart.getUserentity().getEmail());
        return cartMapper.toCartResponseDTO(cart);
    }
}