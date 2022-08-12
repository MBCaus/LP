
package com.mycompany.lista01;

import java.util.Scanner;


public class Chico {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos minutos passou se aquecendo?");
        Integer aquecimento = leitor.nextInt();
        
        System.out.println("Quantos minutos de aerobico você fez?");
        Integer aerobico = leitor.nextInt();
        
        System.out.println("Quantos minutos de musculação você fez?");
        Integer musculacao = leitor.nextInt();
        
        int conta1 = aquecimento * 12;
        int conta2 = aerobico * 20;
        int conta3 = musculacao * 25;
        
        Integer minutos = aquecimento + aerobico + musculacao; 
        
        int calorias = conta1 + conta2 + conta3;
        
        System.out.println(" Olá, Chicó. Você fez um total de " 
                + minutos + " minutos de exercícios e perdeu cerca de " 
                + calorias + " calorias");
        
    }
    
}
