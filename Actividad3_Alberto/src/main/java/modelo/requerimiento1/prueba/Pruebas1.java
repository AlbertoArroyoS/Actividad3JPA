package modelo.requerimiento1.prueba;

import java.util.Date;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Pruebas1 {

	public static void main(String[] args) {
		/*
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("Actividad3JPA");
			
		EntityManager em = null;
		
		// Dar de alta 3 autores
		Autor autor1 = new Autor();
		autor1.setNombre("Nombre1");
		autor1.setApellidos("Apellidos1");
		autor1.setFechaNacimiento(new Date());  // Proporciona una fecha válida
		

		Autor autor2 = new Autor();
		autor2.setNombre("Nombre2");
		autor2.setApellidos("Apellidos2");
		autor2.setFechaNacimiento(new Date());  // Proporciona una fecha válida
		

		Autor autor3 = new Autor();
		autor3.setNombre("Nombre3");
		autor3.setApellidos("Apellidos3");
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
		*/
		/*
		// Dar de alta 2 editoriales
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

		// Dar de alta 8 libros
		emf = Persistence.createEntityManagerFactory("Actividad3JPA");
		em = emf.createEntityManager();
		em.getTransaction().begin();

		// Recuperar los autores y editoriales previamente guardados
		Autor autor1Recuperado = em.find(Autor.class, autor1.getId());
		Autor autor2Recuperado = em.find(Autor.class, autor2.getId());
		Autor autor3Recuperado = em.find(Autor.class, autor3.getId());

		Editorial editorial1Recuperada = em.find(Editorial.class, editorial1.getId());
		Editorial editorial2Recuperada = em.find(Editorial.class, editorial2.getId());

		// Crear libros asociados a autores y editoriales
		List<Libro> libros = new ArrayList<>();

		for (int i = 1; i <= 8; i++) {
			Libro libro = new Libro();
			libro.setTitulo("Libro" + i);
			libro.setPrecio(20.0 * i);

			// Asignar un autor y una editorial a cada libro
			Autor autor = (i % 3 == 1) ? autor1Recuperado : ((i % 3 == 2) ? autor2Recuperado : autor3Recuperado);
			libro.setAutor(autor);

			Editorial editorial = (i % 2 == 1) ? editorial1Recuperada : editorial2Recuperada;
			libro.setEditorial(editorial);

			libros.add(libro);
		}

		// Guardar los libros
		for (Libro libro : libros) {
			em.persist(libro);
		}

		em.getTransaction().commit();
		em.close();

		emf.close();

		// Crear 2 librerías, cada una con 4 libros dados de alta previamente
		emf = Persistence.createEntityManagerFactory("Actividad3JPA");
		em = emf.createEntityManager();
		em.getTransaction().begin();

		// Recuperar algunos libros previamente guardados
		List<Libro> librosParaLibrerias = em.createQuery("SELECT l FROM Libro l", Libro.class)
				.setMaxResults(8) // Obtener los primeros 8 libros
				.getResultList();

		// Crear librerías
		Libreria libreria1 = new Libreria();
		libreria1.setNombre("Libreria1");
		libreria1.setNombreDueno("Dueño1");
		libreria1.setDireccion("DirecciónLibreria1");
		libreria1.setLibros(librosParaLibrerias.subList(0, 4));

		Libreria libreria2 = new Libreria();
		libreria2.setNombre("Libreria2");
		libreria2.setNombreDueno("Dueño2");
		libreria2.setDireccion("DirecciónLibreria2");
		libreria2.setLibros(librosParaLibrerias.subList(4, 8));

		// Guardar las librerías
		em.persist(libreria1);
		em.persist(libreria2);

		em.getTransaction().commit();
		em.close();

		emf.close();*/


	}
	
	
	private void altaBaseDeDatos() {
		

		

	
	}

}
