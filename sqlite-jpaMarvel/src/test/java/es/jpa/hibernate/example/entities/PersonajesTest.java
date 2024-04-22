package es.jpa.hibernate.example.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajesTest {
    static EntityManagerFactory emf;
	EntityManager em;

	Personaje personaje;

	@BeforeAll
	public static void setUp() {
		emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
	}

	@BeforeEach
	public void initEntityManager() {
		em = emf.createEntityManager();
		personaje = new Personaje();
		personaje.setNombre("personajeTest");
		try {
			// Persist in database
			em.getTransaction().begin();
			em.persist(personaje);
			em.getTransaction().commit();
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testPersistFind() {
		try {
			Personaje personajeDB= em.find(Personaje.class, personaje.getId());
			Assertions.assertEquals(personaje.getNombre(), personajeDB.getNombre());
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testUpdate() {
		try {
			Personaje personajeFind = em.find(Personaje.class, personaje.getId()); // See file import.sql
			personajeFind.setNombre("personajeNombre");
            personajeFind.setGenero("generoPersonaje");

			// Persist in database
			em.getTransaction().begin();
			em.merge(personajeFind);
			em.getTransaction().commit();

			// Find by id
			Personaje personajeDbUpdate = em.find(Personaje.class, personaje.getId());
			Assertions.assertEquals(personajeFind.getNombre(), personajeDbUpdate.getNombre());
            Assertions.assertEquals(personajeFind.getGenero(), personajeDbUpdate.getGenero());
		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void removePerson() {
		try {
			int personajeId = this.personaje.getId();
			Personaje personajeBorrar = em.find(Personaje.class, personajeId); // See file import.sql
			em.getTransaction().begin();
			em.remove(personajeBorrar);
			em.getTransaction().commit(); // TODO java.sql.SQLException: database is locked (sometimes)

			// Find by id
			Personaje personajeDb = em.find(Personaje.class, personajeId); // See file import.sql

			Assertions.assertNull(personajeDb);

		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void closeEntityManager() {
		em.close();
		em = null;
	}

	@AfterAll
	public static void closeEntityManagerFactory() {
		emf.close();
	}
}
