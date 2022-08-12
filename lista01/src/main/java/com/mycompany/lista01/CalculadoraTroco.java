
package com.mycompany.lista01;

import java.util.Scanner;

public class CalculadoraTroco {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Adcione o valor únitario do produto: ");
        Double produto = leitor.nextDouble();
        
        System.out.println("Quantidade de vendas realizadas: ");
        Integer vendas = leitor.nextInt();
        
        System.out.println("Valor pago: ");
        Double pago = leitor.nextDouble();
        
        Double conta1 = produto * vendas;
        Double conta2 = pago - conta1;
        
        System.out.println(" Seu troco será de R$" + conta2);
        
    }
    
}
