package com.leandromendes25.e_commerce.mapper;

import com.leandromendes25.e_commerce.dto.request.OrderItemRequestDTO;
import com.leandromendes25.e_commerce.dto.response.OrderItemResponseDTO;
import com.leandromendes25.e_commerce.model.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {

    @Mapping(target = "product", ignore = true)
    @Mapping(target = "order", ignore = true)
    OrderItem toOrderItem(OrderItemRequestDTO dto);

    OrderItemResponseDTO toOrderItemResponseDTO(OrderItem item);

    List<OrderItemResponseDTO> toListOfOrderItemResponseDTO(List<OrderItem> items);
}
