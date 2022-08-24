package com.mycompany.lista03.calculo.media;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite sua segunda nota: ");
        Double nota2 = leitor.nextDouble();
        
        CalcularMedia calculo = new CalcularMedia();
        
        Double resultado = calculo.somaMedia(nota1, nota2);
        
        System.out.println("Sua média é: " + resultado);
        
    }
    
}
