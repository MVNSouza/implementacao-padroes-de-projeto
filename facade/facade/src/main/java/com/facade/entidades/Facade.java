package com.facade.entidades;
//Fachada para simplificar a interação com o sistema de missões espaciais
public class Facade {
    private Astronauta astronauta;
    private Nave nave;
    private CorpoCeleste destino;

    public String realizarMissao(String nomeAstronauta, String nomeNave, String escolhaDestino) {
        
       
     
        if (escolhaDestino.equalsIgnoreCase("Lua")) {
            this.destino = new Lua("");
        } else if (escolhaDestino.equalsIgnoreCase("Planeta")) {
           
            this.destino = new Planeta(""); 
        } else {
            return "Destino inválido! Escolha apenas 'Lua' ou 'Planeta'.";
        }

   
        this.astronauta = new Astronauta(nomeAstronauta);
        this.nave = new Nave(nomeNave, this.astronauta);

        
        RoupaEspacial roupa = FabricaRoupa.escolher(this.destino);
        
       
        String fraseVestir = this.astronauta.vestir(roupa);

        String frasePartir = this.nave.partir(this.destino);

        
        return fraseVestir + ", entrou na nave de nome " + this.nave.getNome() + frasePartir;
    }
}