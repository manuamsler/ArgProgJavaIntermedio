/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria1.persistencia;

import com.mycompany.veterinaria1.clases.ProfesionalMedico;
import com.mycompany.veterinaria1.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Manu
 */
public class ProfesionalMedicoJpaController implements Serializable {

    public ProfesionalMedicoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ProfesionalMedicoJpaController(){
        emf = Persistence.createEntityManagerFactory("com.mycompany_veterinaria1_jar_1.0-SNAPSHOTPU");
    
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ProfesionalMedico profesionalMedico) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(profesionalMedico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ProfesionalMedico profesionalMedico) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            profesionalMedico = em.merge(profesionalMedico);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = profesionalMedico.getId();
                if (findProfesionalMedico(id) == null) {
                    throw new NonexistentEntityException("The profesionalMedico with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ProfesionalMedico profesionalMedico;
            try {
                profesionalMedico = em.getReference(ProfesionalMedico.class, id);
                profesionalMedico.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The profesionalMedico with id " + id + " no longer exists.", enfe);
            }
            em.remove(profesionalMedico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ProfesionalMedico> findProfesionalMedicoEntities() {
        return findProfesionalMedicoEntities(true, -1, -1);
    }

    public List<ProfesionalMedico> findProfesionalMedicoEntities(int maxResults, int firstResult) {
        return findProfesionalMedicoEntities(false, maxResults, firstResult);
    }

    private List<ProfesionalMedico> findProfesionalMedicoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ProfesionalMedico.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ProfesionalMedico findProfesionalMedico(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ProfesionalMedico.class, id);
        } finally {
            em.close();
        }
    }

    public int getProfesionalMedicoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ProfesionalMedico> rt = cq.from(ProfesionalMedico.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
