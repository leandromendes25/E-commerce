package com.leandromendes25.e_commerce.mapper;

import com.leandromendes25.e_commerce.dto.request.CategoryRequestDTO;
import com.leandromendes25.e_commerce.dto.response.CategoryResponseDTO;
import com.leandromendes25.e_commerce.model.Category;
import com.leandromendes25.e_commerce.model.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category toCategory(CategoryRequestDTO data);
    CategoryResponseDTO toCategoryResponseDTO(Category data);
    List<CategoryResponseDTO> toListOfCategorysResponseDTO(List<Category> list);
}
