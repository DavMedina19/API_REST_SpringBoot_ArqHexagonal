package com.infraestructura;

// Importación de Spring Data JPA y la entidad Artista.
import org.springframework.data.jpa.repository.JpaRepository;
import com.dominio.Artista;

/**
 * Interfaz para el repositorio Spring Data JPA de Artista.
 * Extiende JpaRepository, proporcionando operaciones CRUD para la entidad Artista.
 */
public interface SpringDataArtistaRepository extends JpaRepository<Artista, Long> {
    // No es necesario implementar métodos; JpaRepository ya tiene métodos CRUD comunes.
}
