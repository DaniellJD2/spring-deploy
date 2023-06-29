package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Value("${app.message}")
    String message;

    @GetMapping("/api/saludo")
    public String getSaludo() {
        System.out.println(message);
        return "¡Hola desde Spring Boot!";
    }
}
