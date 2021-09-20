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
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.Find", query = "SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha AND u.tipo = :tipo"),
    @NamedQuery(name = "Usuario.FindByCPF", query = "SELECT u FROM Usuario u WHERE u.cpf = :cpf"),
    @NamedQuery(name = "Usuario.FindAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.FindJustFun", query = "SELECT u FROM Usuario u WHERE u.tipo  = modelo.UserTipo.FUNCIONARIO ORDER BY u.nome")
})
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    
    @Column(name = "login", nullable = false, length = 45)
    private String login;
    
    @Column(name = "senha", nullable = false, length = 30)
    private String senha;
    
    @Column(name = "nome", nullable = false, length = 60)
    private String nome;
    
    @Column(name = "cpf", nullable = false, length = 15)
    private String cpf;
    
    @Column(name = "salario")
    private float salario;
    
    @Column(name = "telefone", nullable = false, length = 15)
    private String telefone;
    
    @Column(name = "tipo", nullable = false, length = 25)
    @Enumerated(EnumType.STRING)
    private UserTipo tipo;
    
    public Usuario (){
    
    }

    public Usuario(int id, String login, String senha, String nome, String cpf, float salario, String telefone, UserTipo tipo) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public UserTipo getTipo() {
        return tipo;
    }

    public void setTipo(UserTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.id;
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
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", login=" + login + ", senha=" + senha + ", nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", telefone=" + telefone + ", tipo=" + tipo + '}';
    }
    
    
}
