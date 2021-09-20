/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author zscrollock
 */
public abstract class ControleGeral<T> {
    
    private EntityManagerFactory emf;
    
    public ControleGeral(){
        this.emf = Persistence.createEntityManagerFactory("Projeto_integrado-PU");
    }
    
    protected EntityManager getEntityManager() {
        return this.emf.createEntityManager();
    }
    
     public void inserir(T entity){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();      
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
    }
    
    public void alterar(T entity){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();      
        em.merge(entity);
        em.getTransaction().commit();
        em.close();
    }
    
    public void remover(T entity){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();      
        em.remove(em.merge(entity));
        em.getTransaction().commit();
        em.close();
    } 
}