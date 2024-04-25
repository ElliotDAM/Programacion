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
		poder.setPoder("poderTest");
		try {
			// Persist in database
			em.getTransaction().begin();
			em.persist(poder);
			em.getTransaction().commit();
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testPersistFind() {
		try {
			Poderes poderDB = em.find(Poderes.class, poder.getId());
			Assertions.assertEquals(poder.getPoder(), poderDB.getPoder());
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testUpdate() {
		try {
			Poderes poderFind = em.find(Poderes.class, poder.getId()); // See file import.sql
			poderFind.setPoder("poderUpdate");

			// Persist in database
			em.getTransaction().begin();
			em.merge(poderFind);
			em.getTransaction().commit();

			// Find by id
			Poderes poderDBUpdate = em.find(Poderes.class, poder.getId());
			Assertions.assertEquals(poderFind.getPoder(), poderDBUpdate.getPoder());
		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void removePerson() {
		try {
			int poderId = this.poder.getId();
			Poderes poder = em.find(Poderes.class, poderId); // See file import.sql
			em.getTransaction().begin();
			em.remove(poder);
			em.getTransaction().commit(); // TODO java.sql.SQLException: database is locked (sometimes)

			// Find by id
			Poderes poderDB = em.find(Poderes.class, poderId); // See file import.sql

			Assertions.assertNull(poderDB);

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
