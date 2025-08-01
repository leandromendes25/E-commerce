package com.leandromendes25.e_commerce.mapper;

import com.leandromendes25.e_commerce.dto.request.ProductRequestDTO;
import com.leandromendes25.e_commerce.dto.response.ProductResponseDTO;
import com.leandromendes25.e_commerce.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toProduct(ProductRequestDTO data);
    ProductResponseDTO toProductResponseDTO(Product data);
    List<ProductResponseDTO> toListOfProductsResponseDTO(List<Product> list);
}
