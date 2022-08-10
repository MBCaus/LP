package com.mycompany.lista01;

import java.util.Scanner;

public class PaisQuisito {
 
    public static void main(String[] args) {
        
        Integer filhosMaisNovos,
                filhosDoMeio,
                filhosMaisVelhos;
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Quantos filhos de 0 a 3 "
                + "anos você possui?");
        filhosMaisNovos = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 "
                + "anos você possui?");
        filhosDoMeio = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 "
                + "você anos possui?");
        filhosMaisVelhos = leitor.nextInt();
        
        Double conta1 = filhosMaisNovos * 25.12;
        Double conta2 = filhosDoMeio * 15.88;
        Double conta3 = filhosMaisVelhos * 12.44;
        
        int filhos = filhosMaisNovos + 
                filhosDoMeio + filhosMaisVelhos;
        
        Double total = conta1 + conta2 + conta3;
        
        System.out.printf("Você tem um total de: %s "
                + "filhos "
                + " e vai receber R$%.f2 de bolsa"
                , filhos, total);
    }
    
}
