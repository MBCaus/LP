package com.mycompany.projeto02;

public class Interpolacao {
    
    public static void main(String[] args) {
        
        String nome = "Matheus";
        String sobrenome = "Barizon";
        Integer idade = 18;
        Double altura = 1.78;
        
//        System.out.println("Nome:" + nome);
//        System.out.println("Idade: " + idade);
//        System.out.println("altura: " + altura);
        
//        System.out.print("\t Nome: " + nome + "\n" + "Idade: " + idade + 
//                "\n" + "Altura: " + altura);
        
        String frase = String.format("Nome: %s %s \nIdade: %d \nAltura: %.2f", 
                nome, sobrenome, idade, altura);
        
        System.out.println(frase);
        
//        System.out.printf(frase, args); mesma coisa que o de cima.
    }
    
}
