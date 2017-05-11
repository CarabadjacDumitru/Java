package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class PersistenceManager implements ServletContextListener {
    private static EntityManagerFactory emf;


    public PersistenceManager() { }

    @Override
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("ServletContextListener started");
        emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");  // "PU" for "persistence unit" in persistence.xml
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("ServletContextListener destroyed");
        emf.close();
    }

    public EntityManager getEntityManager() {
        if (emf == null)
            emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        return emf.createEntityManager();
    }
}