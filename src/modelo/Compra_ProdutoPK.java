/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author zscrollock
 */
@Embeddable
public class Compra_ProdutoPK implements Serializable{
    
    @Column(name = "id_compra", insertable = false, updatable = false)
    private int compra;
    
    @Column(name = "id_produto", insertable = false, updatable = false)
    private int produto;

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.compra;
        hash = 53 * hash + this.produto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compra_ProdutoPK other = (Compra_ProdutoPK) obj;
        if (this.compra != other.compra) {
            return false;
        }
        if (this.produto != other.produto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Compra_ProdutoPK{" + "compra=" + compra + ", produto=" + produto + '}';
    }
    
    
}
