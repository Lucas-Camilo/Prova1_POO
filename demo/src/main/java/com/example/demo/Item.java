package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract     class Item {
    public Item()
    {}
    public Item(String n_tipo, float n_preco)
    {
        tipo = n_tipo;
        preco = n_preco;
    }
    @Column(unique = false, nullable = false)
    private String tipo;
    @Column(unique = false, nullable = false)
    private float preco;

    public void setTipo(String n_tipo)
    {
        tipo = n_tipo;
    }
    public String getTipo()
    {
        return tipo;
    }
    public void setPreco(float n_preco)
    {
        preco = n_preco;
    }
    public float getPreco()
    {
        return preco;
    }

}
