package es.jpa.hibernate.example.imp;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import es.jpa.hibernate.example.entities.Personaje;

public class CrudPersonaje {
    private final EntityManagerFactory emf;

    public CrudPersonaje(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Personaje getPersonaje(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Personaje.class, id);
        } finally {
            em.close();
        }
    }

    public boolean updatePersonaje(Personaje personaje) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(personaje);
            em.getTransaction().commit();
            return true;
        } catch (Exception exception) {
            return false;
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    public boolean addPersonaje(Personaje personaje) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(personaje);
            em.getTransaction().commit();
            return true;
        } catch (Exception exception) {
            return false;
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    public void deletePersonaje(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Personaje personaje = em.find(Personaje.class, id);
            if (personaje != null) {
                em.remove(personaje);
            }
            em.getTransaction().commit();
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }
}

