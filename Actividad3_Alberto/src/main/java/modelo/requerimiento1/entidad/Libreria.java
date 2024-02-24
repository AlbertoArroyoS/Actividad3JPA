package modelo.requerimiento1.entidad;

import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Libreria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String nombreDueno;
    private String direccion;
    
    @ManyToMany
    @JoinTable(name = "coleccion_libros_editorial",
    		joinColumns= { @JoinColumn(name="fk_id_libro", referencedColumnName="id") }, //FK que aporta libros
    		   inverseJoinColumns= { @JoinColumn(name="libreria", referencedColumnName="id")}) //FKs que aportan el resto de entidades
    private List<Libro> libros = new ArrayList<>();
    
    
    // Getters and setters
}
