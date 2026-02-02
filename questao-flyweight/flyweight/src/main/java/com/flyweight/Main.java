// Aplicação: simula vendas e imprime resumo de objetos criados
package com.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
         try { BilheteFactory.reset(); } catch (Throwable t) { }

        Evento evento = new Evento("Grande Show");
        evento.venderIngressos(100000, "Estadio Central", "2026-02-02");

        int total = evento.bilhetes.size();
        int tipos = BilheteFactory.getCreatedTypesCount();

        Map<String, Integer> contagem = new HashMap<>();
        for (Bilhete b : evento.bilhetes) {
            String cor = "n/a";
            if (b.getType() != null && b.getType().getCor() != null) cor = b.getType().getCor();
            contagem.put(cor, contagem.getOrDefault(cor, 0) + 1);
        }

        System.out.println("Total bilhetes: " + total);
        System.out.println("Tipos (flyweights) criados: " + tipos);
        System.out.println("Contagem por cor:");
        for (Map.Entry<String, Integer> e : contagem.entrySet()) {
            System.out.println(" - " + e.getKey() + ": " + e.getValue());
        }
    
    }
}