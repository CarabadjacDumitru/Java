package com.controller;

import com.persistence.HBProductsEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProductsController extends HttpServlet {
    private static int n = 1;
    private static final String emKey = "_ProductPU";

    public void doGet(HttpServletRequest req, HttpServletResponse res) {

        HttpSession session = req.getSession();
        EntityManager em = (EntityManager) session.getAttribute(emKey);
        if (em == null) {
            em = new PersistenceManager().getEntityManager();
            session.setAttribute(emKey, em);
        }

        HBProductsEntity prod = new HBProductsEntity();
        prod.setProductName("Super skis " + n++);


        em.getTransaction().begin();
        if (!em.contains(prod)) {
            try {
                em.persist(prod);
                em.flush();
            }
            catch(PersistenceException e) {
                System.err.println("New product not saved to DB.");
                System.err.println(e.getMessage());
            }
        }
        em.getTransaction().commit();

        sendResponse(req, res, prod);
    }
    private void sendResponse(HttpServletRequest req, HttpServletResponse res, HBProductsEntity prod) {
        HttpSession session = req.getSession();
        session.setAttribute("productName", prod.getProductName());
        try {
            res.sendRedirect("confirm.jsp");
        }
        catch(Exception e) { }
    }
}
