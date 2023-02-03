package com.example.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.models.Client;

public class PersistenceDao {
    private static EntityManagerFactory emf;

    private PersistenceDao() {
        emf = Persistence.createEntityManagerFactory("userPU");
    }

    public static EntityManager getEntityManager() {
        if(emf == null) {
            new PersistenceDao();
        }

        return emf.createEntityManager();
    }

    public static void createTable() {
        EntityManager em = getEntityManager();
        em.createQuery("SELECT c FROM Client c", Client.class).getResultList();
    }

    public static void closeEntityManagerFactory() {
        emf.close();
    }

}
