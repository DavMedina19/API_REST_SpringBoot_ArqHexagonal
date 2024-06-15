package com.albummusical.hx;

// Importaciones de Spring Boot necesarias para la configuración y ejecución de la aplicación.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

// Anotación principal que denota una aplicación de Spring Boot.
@SpringBootApplication

// Anotación para especificar los paquetes donde Spring buscará componentes, configuraciones y servicios.
@ComponentScan(basePackages = {"com.albummusical.hx", "com.aplicacion", "com.dominio", "com.infraestructura"})

// Habilita las capacidades de Spring Data JPA para trabajar con repositorios en los paquetes especificados.
@EnableJpaRepositories(basePackages = "com.infraestructura")

// Indica a Spring Boot dónde buscar entidades JPA.
@EntityScan(basePackages = "com.dominio")

public class AlbummusicalHexagonalApplication {

    // Método principal que inicia la aplicación de Spring Boot.
    public static void main(String[] args) {
        // Ejecuta la aplicación de Spring Boot con la clase de configuración proporcionada.
        SpringApplication.run(AlbummusicalHexagonalApplication.class, args);
    }
}

