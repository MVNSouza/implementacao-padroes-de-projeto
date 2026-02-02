// Fabrica: gerencia e fornece instâncias de `BilheteType` (flyweights)
package com.flyweight;

import java.util.ArrayList;
import java.util.List;

public class BilheteFactory {
    private static final List<BilheteType> bilhetetypes = new ArrayList<>();

    public static BilheteType getBilheteType(String nm, String l, String d, String c) {
        for (BilheteType bt : bilhetetypes) {
            if (equals(bt.getNomeEvento(), nm) && equals(bt.getLocal(), l)
                    && equals(bt.getData(), d) && equals(bt.getCor(), c)) {
                return bt;
            }
        }
        BilheteType novo = new BilheteType(nm, l, d, c);
        bilhetetypes.add(novo);
        return novo;
    }

    private static boolean equals(String a, String b) {
        if (a == null) return b == null;
        return a.equals(b);
    }

    public static int getCreatedTypesCount() {
        return bilhetetypes.size();
    }
    
    // Método utilitário para testes: limpa os tipos criados
    public static void reset() {
        bilhetetypes.clear();
    }

}
