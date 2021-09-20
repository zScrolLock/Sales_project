/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Compra_Produto;

/**
 *
 * @author zscrollock
 */
public class Compra_ProdutoControle extends ControleGeral<Compra_Produto>{
    
    public List<Compra_Produto> existProduct(int id_produto, int id_compra){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<Compra_Produto> query = em.createNamedQuery("compra_produto.ExistProduct", Compra_Produto.class);
            query.setParameter("id_produto", id_produto).setParameter("id_compra", id_compra);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
}
