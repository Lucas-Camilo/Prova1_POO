package com.example.demo;

public class SmartphoneServico {
    public SmartphoneServico(int etiqueta, int numeroSerie) {
        this.etiqueta = etiqueta;
        this.numeroSerie = numeroSerie;
    }

    private int etiqueta;
    private int numeroSerie;
    
    public int getEtiqueta() {
        return etiqueta;
    }
    public int getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }

    
}
