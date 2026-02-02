// Tipo (Flyweight): contém estado intrínseco compartilhado entre bilhetes
package com.flyweight;


// Estado intrínseco
public class BilheteType {
    protected String nomeEvento;
    protected String local;
    protected String data;
    protected String cor;

    public BilheteType(String nm, String l, String d, String c) {
        this.data = d;
        this.local = l;
        this.nomeEvento = nm;
        this.cor = c;
    }

    public String getNomeEvento(){
        return this.nomeEvento;
    }

    public void setNomeEvento(String nome){
        this.nomeEvento = nome;
    }

    public String getLocal(){
        return this.local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public String getData(){
        return this.data;
    }
    
    public void setData(String data){
        this.data = data;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
}
