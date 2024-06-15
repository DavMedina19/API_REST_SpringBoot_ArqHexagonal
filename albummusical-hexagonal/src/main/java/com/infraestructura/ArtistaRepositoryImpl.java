package com.infraestructura;

// Importaciones de Spring y clases del dominio.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.dominio.Artista;
import com.dominio.ArtistaRepository;

import java.util.List;
import java.util.Optional;

// Componente de Spring que implementa el repositorio de Artista.
@Component
public class ArtistaRepositoryImpl implements ArtistaRepository {

    // Repositorio JPA para operaciones de base de datos.
    private final SpringDataArtistaRepository jpaRepository;

    // Constructor con inyección de dependencias del repositorio JPA.
    @Autowired
    public ArtistaRepositoryImpl(SpringDataArtistaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    // Guarda un artista en la base de datos.
    @Override
    public Artista save(Artista artista) {
        return jpaRepository.save(artista);
    }

    // Busca un artista por su ID.
    @Override
    public Optional<Artista> findById(Long id) {
        return jpaRepository.findById(id);
    }

    // Devuelve todos los artistas.
    @Override
    public List<Artista> findAll() {
        return jpaRepository.findAll();
    }

    // Elimina un artista por su ID.
    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }
}
