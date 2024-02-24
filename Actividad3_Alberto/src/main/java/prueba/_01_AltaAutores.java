package prueba;

import java.util.Date;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.entidad.Autor;

public class _01_AltaAutores {

	public static void main(String[] args) {

		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("Actividad3JPA");
			
		EntityManager em = null;
		
		// Dar de alta 3 autores
		Autor autor1 = new Autor();
		autor1.setNombre("Miguel");
		autor1.setApellidos("de Cervantes");
		autor1.setFechaNacimiento(new Date());  // Proporciona una fecha válida
		

		Autor autor2 = new Autor();
		autor2.setNombre("Charles");
		autor2.setApellidos("Dickens");
		autor2.setFechaNacimiento(new Date());  // Proporciona una fecha válida
		

		Autor autor3 = new Autor();
		autor3.setNombre("Ken");
		autor3.setApellidos("Follet");
		autor3.setFechaNacimiento(new Date());  // Proporciona una fecha válida
		
		em = emf.createEntityManager();
		em.getTransaction().begin();
		//Salvamos y observamos como la direccion se ha guardado
		//dentro de la tabla clientes(ya que direccion esta embebida)
		em.persist(autor1);
		em.persist(autor2);
		em.persist(autor3);
		
		em.getTransaction().commit(); 
		em.close();		
		
		emf.close();		

	}

}
