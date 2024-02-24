package modelo.requerimiento1.entidad;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String direccion;

    @OneToMany(mappedBy = "editorial", cascade = CascadeType.PERSIST)
    private List<Libro> libros = new ArrayList<>();
    
  //Relacion de 1 a N con el Autor
    @ManyToOne//(cascade=CascadeType.ALL) 
    @JoinColumn(name="fk_id_libro", referencedColumnName="id")
	private Libro libro;
    
    @ManyToMany
    @JoinTable(name = "coleccion_libros_editorial",
    		joinColumns= { @JoinColumn(name="fk_id_libro", referencedColumnName="id") }, //FK que aporta libros
    		   inverseJoinColumns= { @JoinColumn(name="fk_id_editorial", referencedColumnName="id")}) //FKs que aportan el resto de entidades
    private List<Libro> libros_editorial = new ArrayList<>();

    // Getters and setters
}