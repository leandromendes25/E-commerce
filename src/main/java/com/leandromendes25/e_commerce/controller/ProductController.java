package com.leandromendes25.e_commerce.controller;

import com.leandromendes25.e_commerce.dto.request.ProductRequestDTO;
import com.leandromendes25.e_commerce.dto.response.ProductResponseDTO;
import com.leandromendes25.e_commerce.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService prdService;

    @PostMapping
    @PreAuthorize(("hasRole('ADMIN')"))
    public ResponseEntity<ProductResponseDTO> register(@Valid @RequestBody ProductRequestDTO data) {
        var result = prdService.registerNewProduct(data);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDTO>> listAllProducts() {
        var result = prdService.findAll();
        return ResponseEntity.ok().body(result);
    }
}