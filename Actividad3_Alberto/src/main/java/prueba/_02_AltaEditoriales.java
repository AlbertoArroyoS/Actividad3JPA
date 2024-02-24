package prueba;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.entidad.Editorial;

public class _02_AltaEditoriales {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("Actividad3JPA");
			
		EntityManager em = null;
		
		Editorial editorial1 = new Editorial();
		editorial1.setNombre("Editorial1");
		editorial1.setDireccion("Dirección1");


		Editorial editorial2 = new Editorial();
		editorial2.setNombre("Editorial2");
		editorial2.setDireccion("Dirección2");
		
		
		emf = Persistence.createEntityManagerFactory("Actividad3JPA");
		em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(editorial1);
		em.persist(editorial2);

		em.getTransaction().commit();
		em.close();

		emf.close();
	}

}
