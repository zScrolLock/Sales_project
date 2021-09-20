/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author zscrollock
 */
@Entity
@Table(name = "compra")
public class Compra implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCompra", nullable = false)
    private int idCompra;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = false)
    private Date data;
    
    @Column(name = "valortotal", nullable = false)
    private float valortotal;
    
    @ManyToOne
    @JoinColumn(name = "idDistribuidor", nullable = true)
    private Distribuidor distribuidor;
    
    public Compra(){
        
    }

    public Compra(int idCompra, Date data, float valortotal, Distribuidor distribuidor) {
        this.idCompra = idCompra;
        this.data = data;
        this.valortotal = valortotal;
        this.distribuidor = distribuidor;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idCompra;
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
        final Compra other = (Compra) obj;
        if (this.idCompra != other.idCompra) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", data=" + data + ", valortotal=" + valortotal + ", distribuidor=" + distribuidor + '}';
    }
    
    
}
