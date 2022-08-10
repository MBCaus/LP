package com.mycompany.projeto02;

import java.util.Scanner;


public class Leitura {
    
    public static void main(String[] args) {
        
        
        
//      Assiatente para captura de dados inseridos na execução.

        Scanner leitor = new Scanner (System.in); 
        
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        System.out.println("Digite sua Altura: ");
        Double altura = leitor.nextDouble();
        
        System.out.println("Seja bem vindo " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
    }
    
}
