package com.mycompany.projeto02;

import java.util.Scanner;

public class Operador {
    
    public static void main(String[] args) {
        
        /*
            == --> para compração de números.
            != --> diferente que.
            <  --> menor que.
            >  --> maior que.
            >= --> maior ou ingual que.
            <= --> menor ou igual que.
            !  --> negação.
        
            .equals() --> sempre que o íntuito for comparar texto, serve também
            para os demais.
        
            .equalsIgnoreCase() --> ignora os Tipos de Case.
        */
        
        Integer numero1 = 42;
        Integer numero2 = 10;
        
        if(numero1 > numero2) {
            System.out.println(numero1 + " é maior que " + numero2);
        } else if(numero1 < numero2) {
            System.out.println(numero1 + " é menor que " + numero2);
        } else {
            System.out.println("os números " + numero1 + " e " + numero2 + " são iguais.");
        }
        
        Boolean isAluno = true;
        
        if (isAluno) {
            System.out.println("É Aluno...");
        } else {
            System.out.println("Não é Aluno...");
        }
        
        Scanner leitor = new Scanner (System.in);
        
        String nome1 = "Matheus";
        
        System.out.println("Digite seu nome: ");
        String nome2 = leitor.nextLine();
        
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("São iguais...");
        } else {
            System.out.println("Não são iguais...");
        }
                
    }
    
}
