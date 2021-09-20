/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.mysql.cj.xdevapi.Expression;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import modelo.Caixa;

/**
 *
 * @author zscrollock
 */
public class CaixaControle extends ControleGeral<Caixa>{
    
    public List<Caixa> isOpen(){
        EntityManager em = getEntityManager();
        
        try{     
            Query query = em.createQuery("SELECT c FROM Caixa c WHERE c.dataCaixa = CURRENT_DATE AND c.id = (SELECT MAX(c.id) FROM Caixa c)");
            return query.getResultList();
        }finally{
            em.close();
        }
    }
    
    public List<Caixa> findByday(){
        EntityManager em = getEntityManager();
        try{
            TypedQuery<Caixa> query;
            query = em.createNamedQuery("Caixa.findByDay", Caixa.class);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
}
