/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Venda_Produto;

/**
 *
 * @author zscrollock
 */
public class Venda_produtoControle extends ControleGeral<Venda_Produto>{
    
    public List<Venda_Produto> existProduct(int id_produto, int id_venda){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<Venda_Produto> query = em.createNamedQuery("venda_produto.ExistProduct", Venda_Produto.class);
            query.setParameter("id_produto", id_produto).setParameter("id_venda", id_venda);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
    
    public List<Venda_Produto> findByVenda(int id_venda){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<Venda_Produto> query = em.createNamedQuery("venda_produto.findByVenda", Venda_Produto.class);
            query.setParameter("id_venda", id_venda);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
}
