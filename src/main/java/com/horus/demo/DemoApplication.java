package com.horus.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "¡Hola Luis Javier! Tu despliegue continuo en horusappservice fue un éxito.";
    }

    @GetMapping("/api/health")
    public String healthCheck() {
        return "El API está funcionando correctamente en Azure.";
    }
}