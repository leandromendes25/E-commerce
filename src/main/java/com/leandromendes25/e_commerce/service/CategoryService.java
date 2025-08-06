package com.leandromendes25.e_commerce.service;

import com.leandromendes25.e_commerce.dto.request.CategoryRequestDTO;
import com.leandromendes25.e_commerce.dto.response.CategoryResponseDTO;
import com.leandromendes25.e_commerce.exception.CategoryAlreadyExistsException;
import com.leandromendes25.e_commerce.mapper.CategoryMapper;
import com.leandromendes25.e_commerce.model.Category;
import com.leandromendes25.e_commerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    public CategoryResponseDTO createNewCategory(CategoryRequestDTO data) {
        categoryRepository.findByName(data.name()).ifPresent((category -> new CategoryAlreadyExistsException()));
        Category cat = categoryMapper.toCategory(data);
        categoryRepository.save(cat);
        return categoryMapper.toCategoryResponseDTO(cat);
    }
    public List<CategoryResponseDTO> findAll(){
        return categoryMapper.toListOfCategorysResponseDTO(categoryRepository.findAll()) ;
    }
}