package com.infraestructura;

// Importaciones de Spring Framework y clases del dominio.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.aplicacion.ArtistaService;
import com.dominio.Artista;
import java.util.List;
import java.util.Optional;

// Controlador REST para la entidad Artista.
@RestController

// Ruta base para todos los endpoints de este controlador.
@RequestMapping("/artistas")
public class ArtistaController {

    // Servicio para operaciones de Artista.
    private final ArtistaService service;

    // Inyección del servicio de Artista.
    @Autowired
    public ArtistaController(ArtistaService service) {
        this.service = service;
    }

    // Crea un nuevo artista.
    @PostMapping
    public Artista save(@RequestBody Artista artista) {
        return service.save(artista);
    }

    // Busca un artista por ID.
    @GetMapping("/{id}")
    public Optional<Artista> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    // Lista todos los artistas.
    @GetMapping
    public List<Artista> findAll() {
        return service.findAll();
    }

    // Actualiza un artista existente.
    @PutMapping("/{id}")
    public ResponseEntity<Artista> updateArtista(@PathVariable Long id, @RequestBody Artista artistaDetails) {
        Artista artista = service.findById(id)
            .orElseThrow(() -> new RuntimeException("Artista no encontrado con el id: " + id));

        artista.setNombre(artistaDetails.getNombre());
        artista.setPaisOrigen(artistaDetails.getPaisOrigen());
        artista.setEstiloMusical(artistaDetails.getEstiloMusical());

        final Artista updatedArtista = service.save(artista);
        return ResponseEntity.ok(updatedArtista);
    }

    // Elimina un artista por ID.
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.ok("Artista eliminado correctamente");
    }
}
