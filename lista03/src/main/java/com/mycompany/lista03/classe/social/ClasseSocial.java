package com.mycompany.lista03.classe.social;

import java.util.Scanner;

public class ClasseSocial {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua renda mensal: ");
        Double renda = leitor.nextDouble();
        
        CalculoSalarioMinimo salarios = new CalculoSalarioMinimo();
        
        Double quantidade = salarios.salariosMinimos(renda);
        
        CalculoSalarioMinimo classes = new CalculoSalarioMinimo();
        
        String classe = classes.classePertencente(quantidade);
        
        System.out.printf("Você tem aproximadamente %.1f salários minimos e %s", 
                quantidade, classe);
        
        
        
    }
    
}
