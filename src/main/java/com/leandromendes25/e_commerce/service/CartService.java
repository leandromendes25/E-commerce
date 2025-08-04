package com.leandromendes25.e_commerce.service;

import com.leandromendes25.e_commerce.dto.request.CartRequestDTO;
import com.leandromendes25.e_commerce.dto.response.CartResponseDTO;
import com.leandromendes25.e_commerce.mapper.CartMapper;
import com.leandromendes25.e_commerce.model.Cart;
import com.leandromendes25.e_commerce.model.User;
import com.leandromendes25.e_commerce.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepo;

    @Autowired
    private CartMapper cartMapper;

    public CartResponseDTO newCart(CartRequestDTO data){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Cart cart = cartMapper.toCart(data);
        cart.setUserentity(user);
        cartRepo.save(cart);
        return cartMapper.toCartResponseDTO(cart);
    }
    public CartResponseDTO findCartUser(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Long idUser = user.getId();
        Cart cart = cartRepo.findByuserentity(idUser);

        return cartMapper.toCartResponseDTO(cart);
    }
//    public CartResponseDTO updateCart(){
//
//    }
}
