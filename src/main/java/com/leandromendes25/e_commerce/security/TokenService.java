package com.leandromendes25.e_commerce.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.leandromendes25.e_commerce.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {
    @Value("${api.security.token}")
    private String secret;

    public String generateToken(User user) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.create().withIssuer("e-commerce").withSubject(user.getEmail())
                    .withExpiresAt(genExpirationDate()).sign(algorithm);
        } catch (JWTCreationException exception) {
            throw new RuntimeException("Erro durante a criação do token", exception);
        }
    }

    public String validateToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
                    .withIssuer("e-commerce")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException exception) {
            return "Tolken invalido";
        }
    }

    private Instant genExpirationDate() {
        return LocalDateTime.now().plusDays(7).toInstant(ZoneOffset.of("-03:00"));
    }
}
