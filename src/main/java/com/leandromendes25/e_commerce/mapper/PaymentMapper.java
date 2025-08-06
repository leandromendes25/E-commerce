package com.leandromendes25.e_commerce.mapper;

import com.leandromendes25.e_commerce.dto.request.PaymentRequestDTO;
import com.leandromendes25.e_commerce.dto.response.PaymentResponseDTO;
import com.leandromendes25.e_commerce.model.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    @Mapping(target = "order", ignore = true) // setado manualmente
    Payment toPayment(PaymentRequestDTO dto);

    PaymentResponseDTO toPaymentResponseDTO(Payment entity);

    List<PaymentResponseDTO> toListOfPaymentResponseDTO(List<Payment> list);
}
