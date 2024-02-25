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
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private double precio;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "editorial_id")
    private Editorial editorial;

    
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "coleccion_libros_libreria",
            joinColumns = { @JoinColumn(name = "fk_id_libro") },
            inverseJoinColumns = { @JoinColumn(name = "fk_id_libreria") })
    private List<Libreria> librerias = new ArrayList<>();


	public Libro() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public Editorial getEditorial() {
		return editorial;
	}


	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}


	public List<Libreria> getLibrerias() {
		return librerias;
	}


	public void setLibrerias(List<Libreria> librerias) {
		this.librerias = librerias;
	}

    // Getters and setters
    
}
