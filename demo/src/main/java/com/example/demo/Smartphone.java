package com.example.demo;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class Smartphone {
    public Smartphone()
    {}
    private String modelo;
    public Smartphone(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    private String marca;
    
    @ElementCollection
    private List<SmartphoneServico> smartphoneServico;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public List<SmartphoneServico> getSmartphoneServico() {
        return smartphoneServico;
    }
    public void setSmartphoneServico(List<SmartphoneServico> smartphoneServico) {
        this.smartphoneServico = smartphoneServico;
    }


}
