package modelo.entidad;


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
import jakarta.persistence.Table;

@Entity
@Table(name = "editoriales")
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

	public Editorial() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public List<Libro> getLibros_editorial() {
		return libros_editorial;
	}

	public void setLibros_editorial(List<Libro> libros_editorial) {
		this.libros_editorial = libros_editorial;
	}

    
}