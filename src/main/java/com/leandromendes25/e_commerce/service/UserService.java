package com.leandromendes25.e_commerce.service;

import com.leandromendes25.e_commerce.dto.response.RegisterDTO;
import com.leandromendes25.e_commerce.dto.response.UserResponseDTO;
import com.leandromendes25.e_commerce.exception.EmailAlreadyRegistered;
import com.leandromendes25.e_commerce.model.User;
import com.leandromendes25.e_commerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public UserResponseDTO registerNewUser(RegisterDTO data) {
        userRepo.findByEmail(data.email()).ifPresent((user) -> {
            throw new EmailAlreadyRegistered();
        });
        String encryptedPassowrd = encoder.encode(data.password());
        var newUser = User.builder().email(data.email()).password(encryptedPassowrd).role(data.role()).build();
        userRepo.save(newUser);
        return new UserResponseDTO(newUser.getEmail(),newUser.getPassword(),newUser.getRole());
    }
}
