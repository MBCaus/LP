package com.mycompany.lista01;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Olá " + nome + "! Qual o ano de seu nacimento? ");
        Integer ano = leitor.nextInt();
        
        int idade = 2030 - ano;
        
        System.out.println("Em 2030 você terá " + idade + " anos.");
        
    }
}
