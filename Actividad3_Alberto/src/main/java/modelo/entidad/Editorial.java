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
    private List<ColeccionLibrosEditorial> coleccionLibrosEditorial = new ArrayList<>();
    
    
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


	public List<ColeccionLibrosEditorial> getColeccionLibrosEditorial() {
		return coleccionLibrosEditorial;
	}


	public void setColeccionLibrosEditorial(List<ColeccionLibrosEditorial> coleccionLibrosEditorial) {
		this.coleccionLibrosEditorial = coleccionLibrosEditorial;
	}





    
}