package com.leandromendes25.e_commerce.mapper;

import com.leandromendes25.e_commerce.dto.request.CartRequestDTO;
import com.leandromendes25.e_commerce.dto.response.CartResponseDTO;
import com.leandromendes25.e_commerce.model.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "userentity", ignore = true)
    Cart toCart(CartRequestDTO data);
    @Mapping(source = "userentity", target = "userentity")
    CartResponseDTO toCartResponseDTO(Cart data);
}