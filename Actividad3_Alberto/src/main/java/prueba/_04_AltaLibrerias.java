package prueba;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.entidad.ColeccionLibrosLibreria;
import modelo.entidad.Editorial;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;

public class _04_AltaLibrerias {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("Actividad3JPA");
			
		EntityManager em = null;
		
		em = emf.createEntityManager();
	    em.getTransaction().begin();
	    
		Libro libro1 = em.find(Libro.class, 1);
		Libro libro2 = em.find(Libro.class, 2);
		Libro libro3 = em.find(Libro.class, 3);
		Libro libro4 = em.find(Libro.class, 4);
		Libro libro5 = em.find(Libro.class, 5);
		Libro libro6 = em.find(Libro.class, 6);
		Libro libro7 = em.find(Libro.class, 7);
		Libro libro8 = em.find(Libro.class, 8);
		
		 // Crear librerías
        Libreria libreria1 = crearLibreria("Libreria A", "Dueño A", "Dirección A", em);
        libreria1.getColeccionLibrosLibreria().add(crearRelacionLibroLibreria(libro1, libreria1, em));
        libreria1.getColeccionLibrosLibreria().add(crearRelacionLibroLibreria(libro2, libreria1, em));
        libreria1.getColeccionLibrosLibreria().add(crearRelacionLibroLibreria(libro3, libreria1, em));
        libreria1.getColeccionLibrosLibreria().add(crearRelacionLibroLibreria(libro4, libreria1, em));

        Libreria libreria2 = crearLibreria("Libreria B", "Dueño B", "Dirección B", em);
        libreria2.getColeccionLibrosLibreria().add(crearRelacionLibroLibreria(libro5, libreria2, em));
        libreria2.getColeccionLibrosLibreria().add(crearRelacionLibroLibreria(libro6, libreria2, em));
        libreria2.getColeccionLibrosLibreria().add(crearRelacionLibroLibreria(libro7, libreria2, em));
        libreria2.getColeccionLibrosLibreria().add(crearRelacionLibroLibreria(libro8, libreria2, em));
        
        em.getTransaction().commit(); 
		em.close();	
		
		emf.close();	

	}
	
	private static Libreria crearLibreria(String nombre, String nombreDueno, String direccion, EntityManager em) {
	    Libreria libreria = new Libreria();
	    libreria.setNombre(nombre);
	    libreria.setNombreDueno(nombreDueno);
	    libreria.setDireccion(direccion);
	    em.persist(libreria);
	    return libreria;
	}
	
	private static ColeccionLibrosLibreria crearRelacionLibroLibreria(Libro libro, Libreria libreria, EntityManager em) {
	    ColeccionLibrosLibreria relacion = new ColeccionLibrosLibreria();
	    relacion.setLibro(libro);
	    relacion.setLibreria(libreria);
	    em.persist(relacion);
	    return relacion;
	}

	
}
