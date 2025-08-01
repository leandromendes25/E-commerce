package com.leandromendes25.e_commerce.config;

import com.mercadopago.MercadoPagoConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
@Configuration
public class MercadoPago {
        @Value("${mercado-pago.access-token}")
        private String acessToken;

        @PostConstruct
        public void init(){
                MercadoPagoConfig.setAccessToken(acessToken);
        }
}
