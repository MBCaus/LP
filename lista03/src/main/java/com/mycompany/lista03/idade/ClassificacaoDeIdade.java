package com.mycompany.lista03.idade;

import java.util.Scanner;

public class ClassificacaoDeIdade {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        ClassificaIdade idades = new ClassificaIdade();
        
        if(idade <= 2) {
            idades.bebe();
        }else if(idade <= 11) {
            idades.crianca();    
        }else if(idade <= 19) {
            idades.adolescente();
        }else if(idade <= 30) {
            idades.jovem();
        }else if(idade <= 60) {
            idades.adulto();
        }else {
            idades.idoso();
        }
        
    }
    
}
