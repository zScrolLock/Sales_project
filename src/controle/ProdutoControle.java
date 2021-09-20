/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Produto;

/**
 *
 * @author zscrollock
 */
public class ProdutoControle extends ControleGeral<Produto>{
    
    public List<Produto> findByCode(int codigo){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<Produto> query = em.createNamedQuery("Produto.FindByCode", Produto.class);
            query.setParameter("id", codigo);
            return query.getResultList();
            
        }finally{
            em.close();
        }
    }
    
    public List<Produto> findAllOrder(){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<Produto> query = em.createNamedQuery("Produto.FindAllOrder", Produto.class);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
}
