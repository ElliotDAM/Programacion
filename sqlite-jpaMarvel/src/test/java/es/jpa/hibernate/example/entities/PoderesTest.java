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

public class PoderesTest {
    static EntityManagerFactory emf;
	EntityManager em;

	Poderes poder;

	@BeforeAll
	public static void setUp() {
		emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
	}

	@BeforeEach
	public void initEntityManager() {
		em = emf.createEntityManager();
		poder = new Poderes();
		alumno.setName("personTest");
		try {
			// Persist in database
			em.getTransaction().begin();
			em.persist(alumno);
			em.getTransaction().commit();
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testPersistFind() {
		try {
			Alumno alumnoDB = em.find(Alumno.class, alumno.getId());
			Assertions.assertEquals(alumno.getName(), alumnoDB.getName());
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testUpdate() {
		try {
			Alumno alumnoFind = em.find(Alumno.class, alumno.getId()); // See file import.sql
			alumnoFind.setAge(22);

			// Persist in database
			em.getTransaction().begin();
			em.merge(alumnoFind);
			em.getTransaction().commit();

			// Find by id
			Alumno alumnoDBUpdate = em.find(Alumno.class, alumno.getId());
			Assertions.assertEquals(alumnoFind.getAge(), alumnoDBUpdate.getAge());
		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void removePerson() {
		try {
			int personId = this.alumno.getId();
			Alumno alumno = em.find(Alumno.class, personId); // See file import.sql
			em.getTransaction().begin();
			em.remove(alumno);
			em.getTransaction().commit(); // TODO java.sql.SQLException: database is locked (sometimes)

			// Find by id
			Alumno alumnoDB = em.find(Alumno.class, personId); // See file import.sql

			Assertions.assertNull(alumnoDB);

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
