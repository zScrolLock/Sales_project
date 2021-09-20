/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author zscrollock
 */
@Entity
@Table(name = "distribuidor")
@NamedQueries({
    @NamedQuery(name = "Distribuidor.FindAll", query = "SELECT d FROM Distribuidor d"),
    @NamedQuery(name = "Distribuidor.Find", query = "SELECT d FROM Distribuidor d WHERE d.idDistribuidor = :idDistribuidor"),
    @NamedQuery(name = "Distribuidor.FindAllOrder", query = "SELECT d FROM Distribuidor d ORDER BY d.tipo")
})
public class Distribuidor implements Serializable{
    
    @Id
    @Column(name = "idDistribuidor", nullable = false)
    private int idDistribuidor;
    
    @Column(name = "telefone", nullable = false, length = 15)
    private String telefone;
    
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    
    @Column(name = "endereco", nullable = false, length = 50)
    private String endereco;
    
    @Column(name = "cidade", nullable = false, length = 30)
    private String cidade;
    
    @Column(name = "uf", nullable = false, length = 2)
    private String uf;
    
    @Column(name = "tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    private DistribuidorTipo tipo;
    
    public Distribuidor(){
        
    }

    public Distribuidor(int idDistribuidor, String telefone, String nome, String endereco, String cidade, String uf, DistribuidorTipo tipo) {
        this.idDistribuidor = idDistribuidor;
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.tipo = tipo;
    }
    
    

    public int getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(int idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public DistribuidorTipo getTipo() {
        return tipo;
    }

    public void setTipo(DistribuidorTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.idDistribuidor;
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
        final Distribuidor other = (Distribuidor) obj;
        if (this.idDistribuidor != other.idDistribuidor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Distribuidor{" + "idDistribuidor=" + idDistribuidor + ", telefone=" + telefone + ", nome=" + nome + ", endereco=" + endereco + ", cidade=" + cidade + ", uf=" + uf + ", tipo=" + tipo + '}';
    }
    
    
}
