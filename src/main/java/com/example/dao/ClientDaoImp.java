package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.example.models.Client;

public class ClientDaoImp implements IClientDao{

    @Override
    public boolean save(Client o) {
        EntityManager em = PersistenceDao.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
            em.close();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            em.getTransaction().rollback();
            em.close();
            return false;
        }
    }

    @Override
    public boolean delete(Client o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean update(Client o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Client findById(Long s) {
        EntityManager em = PersistenceDao.getEntityManager();
        return em.createNamedQuery("client.findById",Client.class)
        .setParameter("id",s)
        .getSingleResult();
    }

    @Override
    public List<Client> findAll() {
        EntityManager em = PersistenceDao.getEntityManager();
        return em.createNamedQuery("client.findAll",Client.class)
        .getResultList();
    }

    @Override
    public Client findByEmail(String email) {
        EntityManager em = PersistenceDao.getEntityManager();
        return em.createNamedQuery("client.findByEmail",Client.class)
        .setParameter("email",email)
        .getSingleResult();
    }
    
}
