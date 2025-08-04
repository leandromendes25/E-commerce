package com.leandromendes25.e_commerce.controller;

import com.leandromendes25.e_commerce.dto.request.CartRequestDTO;
import com.leandromendes25.e_commerce.dto.response.CartResponseDTO;
import com.leandromendes25.e_commerce.service.CartService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController("carts")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping
    public ResponseEntity<CartResponseDTO> newCart(@RequestBody CartRequestDTO data){
        return ResponseEntity.ok().body(cartService.newCart(data));
    }
//    @GetMapping
//    public ResponseEntity<CartResponseDTO> read(){
//    return ResponseEntity.ok().body(cartService.findCartUser());
//    }
//    @PutMapping
//    public ResponseEntity<CartResponseDTO> updateCart(){
//        return ResponseEntity.ok().body(cartService.update());
//    }
}