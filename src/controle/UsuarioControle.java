/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.UserTipo;
import modelo.Usuario;
/**
 *
 * @author zscrollock
 */
public class UsuarioControle extends ControleGeral<Usuario>{
   
    public List<Usuario> find(String login, String senha, UserTipo tipo){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<Usuario> query = em.createNamedQuery("Usuario.Find", Usuario.class);
            query.setParameter("login", login).setParameter("senha", senha).setParameter("tipo", tipo);
            return query.getResultList();
        } finally{
            em.close();
        }
    }
    
    public List<Usuario> findByCpf(String cpf){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<Usuario> query = em.createNamedQuery("Usuario.FindByCPF", Usuario.class);
            query.setParameter("cpf", cpf);
            return query.getResultList();
        } finally{
            em.close();
        }
    }
    
    public List<Usuario> findAll(){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<Usuario> query = em.createNamedQuery("Usuario.FindAll", Usuario.class);
            return query.getResultList();
        } finally{
            em.close();
        }
    }
    
    public List<Usuario> findByTipoFun(){
        EntityManager em = getEntityManager();
        
        try{
            TypedQuery<Usuario> query = em.createNamedQuery("Usuario.FindJustFun", Usuario.class);
            return query.getResultList();
        } finally{
            em.close();
        }
    }
}