package com.mycompany.lista01;

import java.util.Scanner;

public class PaisQuisito {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos filhos de 0 a 3 anos possui?");
        Integer MaisNovos = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos possui?");
        Integer DoMeio = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos possui?");
        Integer MaisVelhos = leitor.nextInt();
        
        Double conta1 = MaisNovos * 25.12;
        Double conta2 = DoMeio * 15.88;
        Double conta3 = MaisVelhos * 12.44;
        
        Integer filhos = MaisNovos + DoMeio + MaisVelhos; 
        
        Double total = conta1 + conta2 + conta3;
        
        System.out.println(" Você tem um total de " 
                + filhos + " filhos e vai receber R$" 
                + total + " de bolsa.");
        
    }
    
}
