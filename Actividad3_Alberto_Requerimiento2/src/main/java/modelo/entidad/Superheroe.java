package modelo.entidad;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "superheroes")
public class Superheroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String poder;

    @OneToOne(mappedBy = "superheroe")
    private IdentidadSecreta identidadSecreta;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    @ManyToMany
    @JoinTable(
        name = "superheroe_habilidad",
        joinColumns = @JoinColumn(name = "superheroe_id"),
        inverseJoinColumns = @JoinColumn(name = "habilidad_id"))
    private List<Habilidad> habilidades;

	public Superheroe() {
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

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public IdentidadSecreta getIdentidadSecreta() {
		return identidadSecreta;
	}

	public void setIdentidadSecreta(IdentidadSecreta identidadSecreta) {
		this.identidadSecreta = identidadSecreta;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public List<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}


}
