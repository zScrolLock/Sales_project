/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.Venda;

/**
 *
 * @author zscrollock
 */
public class VendaControle extends ControleGeral<Venda>{
    
    public Long countVendas(){
        EntityManager em = getEntityManager();
        String select = "SELECT COUNT(v) FROM Venda v";
        try{
            Query q = em.createQuery(select);
            Long count = (Long) q.getSingleResult();
            return count;
        }finally{
            em.close();
        }
    }
}
