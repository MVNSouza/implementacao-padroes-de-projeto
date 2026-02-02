package com.facade;
import com.facade.entidades.Facade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Facade facade = new Facade();

        System.out.println("--- Sistema de Controle de Missão ---");
        
        System.out.print("Digite o nome do astronauta: ");
        String nomeA = scanner.nextLine();

        System.out.print("Digite o nome da nave: ");
        String nomeN = scanner.nextLine();

        System.out.print("Digite o destino (Lua, Planeta): ");
        String nomeD = scanner.nextLine();

       
        String relatorio = facade.realizarMissao(nomeA, nomeN, nomeD);

        System.out.println("\nRELATÓRIO FINAL:");
        System.out.println(relatorio);
        
        scanner.close();
    }
}