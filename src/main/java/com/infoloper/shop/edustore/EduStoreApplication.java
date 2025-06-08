package com.infoloper.shop.edustore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@EnableMethodSecurity
@SpringBootApplication
public class EduStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduStoreApplication.class, args);
    }

}
