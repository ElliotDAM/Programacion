package es.jpa.hibernate.example.imp;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import es.jpa.hibernate.example.entities.Poderes;

public class CrudPoder {
    private final EntityManagerFactory emf;

    public CrudPoder(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Poderes getPoder(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Poderes.class, id);
        } finally {
            em.close();
        }
    }

    public boolean updatePoder(Poderes poder) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(poder);
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

    public boolean addPoder(Poderes poder) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(poder);
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

    public void deletePoder(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Poderes poder = em.find(Poderes.class, id);
            if (poder != null) {
                em.remove(poder);
            }
            em.getTransaction().commit();
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }
}

