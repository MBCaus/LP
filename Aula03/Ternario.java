package com.example.demo;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Boolean isMatriculado = true;
        
        String frase;
        
//        if(isMatriculado) {
//            frase = "Está matriculado";
//        } else {
//            frase = "Não está matriculado";
//        }
        
//        frase = isMatriculado ? "Está matriculado" : "Não está matriculado";
//        
//        System.out.println(frase);

        Integer numero = 42;
        
        if(numero % 2 == 0) {
            System.out.println("É par...");
        } else {
            System.out.println("Não é par...");
        }
    }
}
