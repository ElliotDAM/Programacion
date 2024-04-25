package es.jpa.hibernate.example.imp;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import es.jpa.hibernate.example.entities.Alias;

public class CrudAlias {
    private final EntityManagerFactory emf;

    public CrudAlias(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Alias getAlias(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Alias.class, id);
        } finally {
            em.close();
        }
    }

    public boolean updateAlias(Alias alias) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(alias);
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

    public boolean addAlias(Alias alias) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(alias);
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

    public void deleteAlias(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Alias alias = em.find(Alias.class, id);
            if (alias != null) {
                em.remove(alias);
            }
            em.getTransaction().commit();
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }
}
