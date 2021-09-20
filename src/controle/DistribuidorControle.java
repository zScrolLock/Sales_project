/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Distribuidor;

/**
 *
 * @author zscrollock
 */
public class DistribuidorControle extends ControleGeral<Distribuidor>{
    
    public List<Distribuidor> findById(int codigo){
        EntityManager em = getEntityManager();
        try{
            TypedQuery<Distribuidor> query = em.createNamedQuery("Distribuidor.Find",Distribuidor.class);
            query.setParameter("idDistribuidor", codigo);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
    
    public List<Distribuidor> findAll(){
        EntityManager em = getEntityManager();
        try{
            TypedQuery<Distribuidor> query = em.createNamedQuery("Distribuidor.FindAll",Distribuidor.class);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
    
    public List<Distribuidor> findAllOrder(){
        EntityManager em = getEntityManager();
        try{
            TypedQuery<Distribuidor> query = em.createNamedQuery("Distribuidor.FindAllOrder",Distribuidor.class);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
}
