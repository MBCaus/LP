package com.mycompany.lista01;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Integer numero = leitor.nextInt();
        
        System.out.println("Tabuada do " + numero);
        
        for (int i = 0; i <= 10; i++) {
            
            Integer conta = i * numero;
            
            System.out.println(numero + " X " + i + " = " + conta);
            
        }
        
    }
    
}
