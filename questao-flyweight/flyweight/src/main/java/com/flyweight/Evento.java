// Contexto/Aggregate: Evento que agrega bilhetes e realiza venda (usa a fábrica)
package com.flyweight;

import java.util.ArrayList;

public class Evento {
    public ArrayList<Bilhete> bilhetes = new ArrayList<>(); 
    public String nome;
    public int quantidadeIngressos = 0;

    public Evento(String nome) {
        this.nome = nome;
    }

    public void venderIngressos(int quantidade, String local, String data) {
        String[] cores = {"ouro", "prata", "bronze"};
        int inicio = this.quantidadeIngressos + 1;
        for (int i = 0; i < quantidade; i++) {
            String cor = cores[i % cores.length];
            BilheteType bt = BilheteFactory.getBilheteType(this.nome, local, data, cor);
            Bilhete b = new Bilhete(inicio + i, bt);
            bilhetes.add(b);
        }
        this.quantidadeIngressos += quantidade;
    }

}
