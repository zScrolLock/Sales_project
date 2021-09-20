/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author zscrollock
 */
@Entity
@Table(name = "caixa")
@NamedQueries({
    @NamedQuery(name = "Caixa.findByDay", query = "SELECT c FROM Caixa c WHERE c.dataCaixa = CURRENT_DATE AND c.status = modelo.CaixaStatus.ABERTO")
})
public class Caixa implements Serializable{
    
    @Id
    @Column(name = "id_caixa", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "datacaixa", nullable = false)
    private Date dataCaixa;
    
    @Column(name = "saldo_abertura", nullable = false)
    private float saldo_abertura;
    
    @Column(name = "saldo_fechamento", nullable = false)
    private float saldo_fechamento;
    
    @Column(name = "caixa_status", nullable = true)
    @Enumerated(EnumType.STRING)
    private CaixaStatus status;
    
    @ManyToOne
    @JoinColumn(name = "idCompra", nullable = true)
    private Compra compra;
    
    @ManyToOne
    @JoinColumn(name = "idVenda", nullable = true)
    private Venda venda;

    public Caixa(){
        
    }

    public Caixa(Date dataCaixa, float saldo_abertura, float saldo_fechamento, Compra compra, Venda venda) {
        this.dataCaixa = dataCaixa;
        this.saldo_abertura = saldo_abertura;
        this.saldo_fechamento = saldo_fechamento;
        this.compra = compra;
        this.venda = venda;
    }

    public CaixaStatus getStatus() {
        return status;
    }

    public void setStatus(CaixaStatus status) {
        this.status = status;
    }   
    
    public Date getDataCaixa() {
        return dataCaixa;
    }

    public void setDataCaixa(Date dataCaixa) {
        this.dataCaixa = dataCaixa;
    }

    public float getSaldo_abertura() {
        return saldo_abertura;
    }

    public void setSaldo_abertura(float saldo_abertura) {
        this.saldo_abertura = saldo_abertura;
    }

    public float getSaldo_fechamento() {
        return saldo_fechamento;
    }

    public void setSaldo_fechamento(float saldo_fechamento) {
        this.saldo_fechamento = saldo_fechamento;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.dataCaixa);
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
        final Caixa other = (Caixa) obj;
        if (!Objects.equals(this.dataCaixa, other.dataCaixa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Caixa{" + "dataCaixa=" + dataCaixa + ", saldo_abertura=" + saldo_abertura + ", saldo_fechamento=" + saldo_fechamento + ", compra=" + compra + ", venda=" + venda + '}';
    }
    
    
}
