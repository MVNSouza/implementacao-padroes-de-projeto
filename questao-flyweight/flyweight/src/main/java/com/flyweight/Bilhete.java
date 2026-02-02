// Contexto: Bilhete concreto que referencia um `BilheteType` (flyweight)
package com.flyweight;

public class Bilhete {
    private Integer ID;
    private BilheteType type;

    public Bilhete(Integer id, BilheteType bt) {
        this.ID = id;
        this.type = bt;
    }

    public Integer getID() {
        return ID;
    }

    public BilheteType getType() {
        return type;
    }

    @Override
    public String toString() {
        String cor = (type != null && type.getCor() != null) ? type.getCor() : "n/a";
        return String.format("ID: %d, Cor: %s", ID, cor);
    }

}
