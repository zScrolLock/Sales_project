/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author zscrollock
 */
@Entity
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.FindByCode", query = "SELECT p FROM Produto p WHERE p.idProduto = :id"),
    @NamedQuery(name = "Produto.FindAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.FindAllOrder", query = "SELECT p FROM Produto p ORDER BY p.nome")
})
public class Produto implements Serializable{
    
    @Id
    @Column(name = "id", nullable = false)
    private int idProduto;
    
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    
    @Column(name = "quantidade_min", nullable = false)
    private int quantidade_min;
    
    @Column(name = "preco", nullable = false)
    private float preco;
    
    @Column(name = "status", nullable = false, length = 13)
    @Enumerated(EnumType.STRING)
    private ProdutoStatus status;
    
    @Column(name = "tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    private ProdutoTipo tipo;
    
    public Produto(){
             
    }

    public Produto(int idProduto, String nome, int quantidade, int quantidade_min, float preco, ProdutoStatus status, ProdutoTipo tipo) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.quantidade = quantidade;
        this.quantidade_min = quantidade_min;
        this.preco = preco;
        this.status = status;
        this.tipo = tipo;
    }
    
    

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade_min() {
        return quantidade_min;
    }

    public void setQuantidade_min(int quantidade_min) {
        this.quantidade_min = quantidade_min;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ProdutoStatus getStatus() {
        return status;
    }

    public void setStatus(ProdutoStatus status) {
        this.status = status;
    }

    public ProdutoTipo getTipo() {
        return tipo;
    }

    public void setTipo(ProdutoTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.idProduto;
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
        final Produto other = (Produto) obj;
        if (this.idProduto != other.idProduto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "idProduto=" + idProduto + ", nome=" + nome + ", quantidade=" + quantidade + ", quantidade_min=" + quantidade_min + ", preco=" + preco + ", status=" + status + ", tipo=" + tipo + '}';
    }  
}
