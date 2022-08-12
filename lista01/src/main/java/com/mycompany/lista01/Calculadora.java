
package com.mycompany.lista01;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Double NumeroUm = leitor.nextDouble();
        
        System.out.println("Digite outro número: ");
        Double NumeroDois = leitor.nextDouble();
        
        Double conta1 = NumeroUm + NumeroDois;
        
        System.out.println("Resultado da soma: \n" + conta1);
        
        Double conta2 = NumeroUm - NumeroDois;
        
        System.out.println("Resultado da subtração: \n" + conta2);
        
        Double conta3 = NumeroUm * NumeroDois;
        
        System.out.println("Resultado da multiplicação: \n" + conta3);
        
        Double conta4 = NumeroUm / NumeroDois;
        
        System.out.println("Resultado da divisão: \n" + conta4);
        
    }
    
}
