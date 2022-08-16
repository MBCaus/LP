package com.mycompany.lista01;

import java.util.Scanner;

public class CalculoMedia {
   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a 1º nota: ");
        Double PrimeiraNota = leitor.nextDouble();
        
        System.out.println("Digite a 2º nota: ");
        Double SegundaNota = leitor.nextDouble();
        
        Double media = (PrimeiraNota + SegundaNota) /2;
        
        System.out.println("Olá " + nome + ". Sua média foi de " + media);
        
    }
    
}
