package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class Servico {
    public Servico(String data, String detalhes, List<Item> itens) 
    {
        this.data = data;
        this.detalhes = detalhes;
        Itens = itens;
    }
    public Servico(){}

    private String data;
    private String detalhes;

    @ElementCollection
    private List<Item> Itens = new ArrayList<>();

    private Cliente cliente;

    private SmartphoneServico smartphoneServico;

    public SmartphoneServico getSmartphoneServico() {
        return smartphoneServico;
    }

    public void setSmartphoneServico(SmartphoneServico smartphoneServico) {
        this.smartphoneServico = smartphoneServico;
    }
    
    public String getData() 
    {
        return data;
    }
    public List<Item> getItens()
    {
        return Itens;
    }
    public void setItens(List<Item> itens) 
    {
        Itens = itens;
    }
    public String getDetalhes()
    {
        return detalhes;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setDetalhes(String detalhes) 
    {
        this.detalhes = detalhes;
    }
    public void setData(String data) 
    {
        this.data = data;
    }
    public float calcularPrecoTotal()
    {
        float preco = 0f;
        for(Item i: Itens)
        {
            preco += i.getPreco();
        }

        return preco;
    }
}
