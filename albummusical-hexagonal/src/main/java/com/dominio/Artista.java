package com.dominio;

// Importaciones de Jakarta Persistence para mapeo objeto-relacional.
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Anotación que indica que esta clase es una entidad JPA.
@Entity

// Anotación que especifica la tabla 'artistas' en la base de datos para esta entidad.
@Table(name = "artistas")
public class Artista {
    // Anotación que designa este campo como la clave primaria de la entidad.
    @Id
    @Column(name = "ID")
    private Long ID;

    // Anotación que asocia este campo con la columna 'Nombre' en la tabla.
    @Column(name = "Nombre")
    private String Nombre;

    // Anotación que asocia este campo con la columna 'PaisOrigen' en la tabla.
    @Column(name = "PaisOrigen")
    private String PaisOrigen;

    // Anotación que asocia este campo con la columna 'EstiloMusical' en la tabla.
    @Column(name = "EstiloMusical")
    private String EstiloMusical;

    // Constructor vacío necesario para JPA.
    public Artista() {
    }

    // Constructor con parámetros para crear instancias de Artista.
    public Artista(Long ID, String Nombre, String PaisOrigen, String EstiloMusical) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.PaisOrigen = PaisOrigen;
        this.EstiloMusical = EstiloMusical;
    }

    // Getters y setters para acceder y modificar las propiedades de la entidad.
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getEstiloMusical() {
        return EstiloMusical;
    }

    public void setEstiloMusical(String EstiloMusical) {
        this.EstiloMusical = EstiloMusical;
    }
}
