package com.mycompany.lista03.pesoideal;

import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu sexo: 'Ex: [M] ou [F]' ");
        String sexo = leitor.nextLine();
        
        System.out.println("Agora digite sua altura: ");
        Double altura = leitor.nextDouble();
        
        CalculaPesoIdeal fim = new CalculaPesoIdeal();
        
        Double total = fim.calculo(sexo, altura);
        
        System.out.println(Math.round(total));
        
    }
    
}
