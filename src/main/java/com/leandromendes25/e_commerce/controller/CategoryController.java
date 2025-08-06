package com.leandromendes25.e_commerce.controller;

import com.leandromendes25.e_commerce.dto.request.CategoryRequestDTO;
import com.leandromendes25.e_commerce.dto.response.CategoryResponseDTO;
import com.leandromendes25.e_commerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<CategoryResponseDTO> create(@RequestBody CategoryRequestDTO data){
       return ResponseEntity.ok().body(categoryService.createNewCategory(data));
    }
    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<CategoryResponseDTO>> findAll(){
       return ResponseEntity.ok().body(categoryService.findAll());
    }
}