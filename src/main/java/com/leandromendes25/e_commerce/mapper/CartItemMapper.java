package com.leandromendes25.e_commerce.mapper;

import com.leandromendes25.e_commerce.dto.request.CartItemRequestDTO;
import com.leandromendes25.e_commerce.dto.response.CartItemResponseDTO;
import com.leandromendes25.e_commerce.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CartItemMapper {

    @Mapping(target = "product", ignore = true) // será setado no Service
    CartItem toCartItem(CartItemRequestDTO dto);

    CartItemResponseDTO toCartItemResponseDTO(CartItem entity);

    List<CartItemResponseDTO> toListOfCartItemResponseDTO(List<CartItem> items);
}
