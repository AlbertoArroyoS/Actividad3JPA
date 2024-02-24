package prueba;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.entidad.Autor;
import modelo.entidad.Editorial;
import modelo.entidad.Libro;

public class _03_AltaLibros {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("Actividad3JPA");
			
		EntityManager em = null;
		
		Libro libro = new Libro();
        libro.setTitulo("Libro ");
        libro.setPrecio(29.99);
        
        em = emf.createEntityManager();
        em.getTransaction().begin();
        
        //Buscamos a editorial en nuestra bbdd
        Editorial ed1 = new Editorial();
        ed1 = em.find(Editorial.class, 1);
        libro.setEditorial(ed1);
        Autor aut1 = new Autor ();
        aut1 = em.find(Autor.class,1);
        libro.setAutor(aut1);
        
        em.persist(libro);
		
		em.getTransaction().commit(); 
		em.close();				

		//cerramos el entitymanager
		emf.close();	
	}

}
