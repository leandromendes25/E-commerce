package com.leandromendes25.e_commerce.mapper;

import com.leandromendes25.e_commerce.dto.request.UserRequestDTO;
import com.leandromendes25.e_commerce.dto.response.UserResponseDTO;
import com.leandromendes25.e_commerce.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserRequestDTO dto);

    UserResponseDTO toUserResponseDTO(User user);

    List<UserResponseDTO> toListOfUserResponseDTO(List<User> users);
}