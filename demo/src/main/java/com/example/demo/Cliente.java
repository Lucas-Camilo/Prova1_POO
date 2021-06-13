package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class Cliente {
    private short Telefone;
    private String nome;
    private String cpf;

    @ElementCollection
    private List<Servico> servicos = new ArrayList<>();

    public short getTelefone() {
        return Telefone;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public String getNome() {
        return nome;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(short telefone) {
        this.Telefone = telefone;
    }

}
