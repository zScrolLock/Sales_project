/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author zscrollock
 */
@Entity
@Table(name = "compra_produto")
@NamedQueries({
    @NamedQuery(name = "compra_produto.ExistProduct", query = "SELECT cp FROM Compra_Produto cp WHERE cp.produto.idProduto = :id_produto AND cp.compra.idCompra = :id_compra")
})
public class Compra_Produto implements Serializable{
    
    @EmbeddedId
    private Compra_ProdutoPK compra_ProdutoPK;
    
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    
    @Column(name = "valortotal", nullable = false)
    private float valortotal;
    
    @ManyToOne
    @JoinColumn(name = "id_compra", nullable = false)
    private Compra compra;
    
    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    private Produto produto;

    public Compra_ProdutoPK getCompra_ProdutoPK() {
        return compra_ProdutoPK;
    }

    public void setCompra_ProdutoPK(Compra_ProdutoPK compra_ProdutoPK) {
        this.compra_ProdutoPK = compra_ProdutoPK;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.compra_ProdutoPK);
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
        final Compra_Produto other = (Compra_Produto) obj;
        if (!Objects.equals(this.compra_ProdutoPK, other.compra_ProdutoPK)) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String toString() {
        return "Compra_Produto{" + "compra_ProdutoPK=" + compra_ProdutoPK + ", quantidade=" + quantidade + ", valortotal=" + valortotal + ", compra=" + compra + ", produto=" + produto + '}';
    }
            
       
}
