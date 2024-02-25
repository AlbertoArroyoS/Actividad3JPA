package modelo.entidad;


import java.util.ArrayList;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "librerias")
public class Libreria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String nombreDueno;
    private String direccion;
    
    @ManyToMany
    @JoinTable(name = "coleccion_libros_libreria",
            joinColumns = { @JoinColumn(name = "fk_id_libreria") },
            inverseJoinColumns = { @JoinColumn(name = "fk_id_libro") })
    private List<ColeccionLibrosLibreria> coleccionLibrosLibreria = new ArrayList<>();

	public Libreria() {
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

	public String getNombreDueno() {
		return nombreDueno;
	}

	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<ColeccionLibrosLibreria> getColeccionLibrosLibreria() {
		return coleccionLibrosLibreria;
	}

	public void setColeccionLibrosLibreria(List<ColeccionLibrosLibreria> coleccionLibrosLibreria) {
		this.coleccionLibrosLibreria = coleccionLibrosLibreria;
	}

	

}
