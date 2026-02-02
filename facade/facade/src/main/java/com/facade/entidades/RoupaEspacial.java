package com.facade.entidades;

public abstract class RoupaEspacial {
    protected String descricao;
    
    public String gerarDescricao() {
        return " vestiu a " + descricao;
    }
}
