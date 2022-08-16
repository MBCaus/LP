package com.mycompany.lista01;

import java.util.Scanner;

public class Elevador {
    
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o limite de peso de um elevador: ");
        Double peso = leitor.nextDouble();
        
        System.out.println("Digite o limite de pessoas em um elevador: ");
        Integer pessoas = leitor.nextInt();
        
        System.out.println("Digite o peso da 1º pessoa que entrou: ");
        Double primeira = leitor.nextDouble();
        
        System.out.println("Digite o peso da 2º pessoa que entrou: ");
        Double segunda = leitor.nextDouble();
             
        System.out.println("Digite o peso da 3º pessoa que entrou: ");
        Double terceira = leitor.nextDouble();
        
        Double total = primeira + segunda + terceira;
        
        System.out.println("Entratam 3 pessoas no elevador, no qual "
        + "cabem " + pessoas + " pessoas.\n" );
        System.out.println("O peso total no elevador é de " + total
        + ", sendo que ele suporta " + peso);

    }
    
}
