package com.dominio;

import java.util.List;
import java.util.Optional;

// Repositorio para operaciones CRUD de Artista.
public interface ArtistaRepository {
    // Guarda un artista.
    Artista save(Artista artista);
    
    // Busca un artista por ID.
    Optional<Artista> findById(Long id);
    
    // Lista todos los artistas.
    List<Artista> findAll();
    
    // Elimina un artista por ID.
    void deleteById(Long id);
}
