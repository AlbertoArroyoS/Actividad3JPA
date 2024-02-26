package modelo.entidad;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "debilidades")
public class Debilidad {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    @ManyToMany(mappedBy = "debilidades")
    private List<Superheroe> superheroes;

	public Debilidad() {
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

	public List<Superheroe> getSuperheroes() {
		return superheroes;
	}

	public void setSuperheroes(List<Superheroe> superheroes) {
		this.superheroes = superheroes;
	}

    
}
