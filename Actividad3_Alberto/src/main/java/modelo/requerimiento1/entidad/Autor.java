package modelo.requerimiento1.entidad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellidos;
    
    @Temporal(TemporalType.DATE)
	private Date fechaNacimiento;//Date del paquete java.util

    
    //Relacion de 1 a N con el Autor
    @ManyToOne//(cascade=CascadeType.ALL) 
    @JoinColumn(name="fk_id_libro", referencedColumnName="id")
	private Libro libro;
    
    // Getters and setters
}
