package com.aplicacion;

// Importación de la clase Artista desde el paquete de dominio.
import com.dominio.Artista;

// Importaciones de Java para trabajar con listas y valores opcionales.
import java.util.List;
import java.util.Optional;

// Interfaz para definir las operaciones del servicio de Artista.
public interface ArtistaService {
    // Método para guardar un artista en la base de datos.
    // Retorna el artista guardado con su ID generado.
    Artista save(Artista artista);

    // Método para buscar un artista por su ID.
    // Retorna un Optional que puede contener el Artista si se encuentra.
    Optional<Artista> findById(Long id);

    // Método para obtener todos los artistas de la base de datos.
    // Retorna una lista de artistas.
    List<Artista> findAll();

    // Método para eliminar un artista de la base de datos por su ID.
    void deleteById(Long id);
}
