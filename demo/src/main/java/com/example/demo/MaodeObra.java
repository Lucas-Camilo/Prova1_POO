package com.example.demo;

import javax.persistence.Entity;

@Entity
public class MaodeObra extends Item{
    public MaodeObra(String n_tipo, float n_preco, String n_descricao) {
        super(n_tipo, n_preco);
        descricao = n_descricao;
    }
    
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String n_descricao) {
        descricao = n_descricao;
    }
}
