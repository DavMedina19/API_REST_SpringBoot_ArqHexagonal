package com.aplicacion;

// Importaciones de clases y anotaciones necesarias.
import com.dominio.Artista;
import com.dominio.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

// Anotación que marca esta clase como un servicio en Spring.
@Service
public class ArtistaServiceImpl implements ArtistaService {

    // Repositorio para operaciones de base de datos de Artista.
    private final ArtistaRepository repository;

    // Inyección de dependencias del repositorio.
    @Autowired
    public ArtistaServiceImpl(ArtistaRepository repository) {
        this.repository = repository;
    }

    // Guarda un artista en la base de datos y lo devuelve.
    @Override
    public Artista save(Artista artista) {
        return repository.save(artista);
    }

    // Busca un artista por ID, devuelve un Optional de Artista.
    @Override
    public Optional<Artista> findById(Long id) {
        return repository.findById(id);
    }

    // Devuelve una lista de todos los artistas.
    @Override
    public List<Artista> findAll() {
        return repository.findAll();
    }

    // Elimina un artista por su ID.
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
