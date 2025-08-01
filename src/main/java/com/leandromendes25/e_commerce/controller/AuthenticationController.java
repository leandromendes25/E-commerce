package com.leandromendes25.e_commerce.controller;

import com.leandromendes25.e_commerce.dto.request.AuthRequestDTO;
import com.leandromendes25.e_commerce.dto.response.LoginResponseDTO;
import com.leandromendes25.e_commerce.dto.response.RegisterDTO;
import com.leandromendes25.e_commerce.model.User;
import com.leandromendes25.e_commerce.security.TokenService;
import com.leandromendes25.e_commerce.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@Valid @RequestBody AuthRequestDTO data){
    var usernamePassword = new UsernamePasswordAuthenticationToken(data.email(), data.password());
    var auth = authenticationManager.authenticate(usernamePassword);
    var token   = tokenService.generateToken((User) auth.getPrincipal());
    return ResponseEntity.ok(new LoginResponseDTO(token));
    }
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDTO data){
    userService.registerNewUser(data);
    return ResponseEntity.ok().build();
    }
}
