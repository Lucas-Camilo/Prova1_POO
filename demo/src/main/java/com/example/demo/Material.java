package com.example.demo;

import javax.persistence.Entity;

@Entity
public class Material  extends Item{
    public Material()
    {
        super();
    }

    private String modelo;

    public Material(String n_tipo, float n_preco, String n_modelo) {
        super(n_tipo, n_preco);
        modelo = n_modelo;
    }
    public String getModelo() 
    {
        return modelo;
    }
    public void setModelo(String n_modelo) 
    {
        modelo = n_modelo;
    }

    

}
