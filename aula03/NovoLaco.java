package com.example.demo;

import java.util.Scanner;

public class NovoLaco {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer numero = 10;

//        System.out.println("Acerte o número: ");
//        Integer numeroDigitado = leitor.nextInt();
//        while (true) {
//
//            System.out.println("Acerte o número: ");
//            Integer numeroDigitado = leitor.nextInt();
//
//            if (numeroDigitado == 10) {
//                System.out.println("Número correto! Parabéns.");
//                break;
//            } else {
//                System.out.println("Número incorreto, digite novamente.");
//            }
//
//        }
//            while(numeroDigitado != numero) {
//                System.out.println("Número incorreto, digite novamente.");
//                numeroDigitado = leitor.nextInt();
//            }
//            
//            System.out.println("Número correto! Parabéns.");

        Integer numeroDigitado = leitor.nextInt();

        do {
            System.out.println("Acerte o número: ");
            numeroDigitado = leitor.nextInt();
        } while (numeroDigitado != numero);
        
        System.out.println("Número correto! Parabéns.");

    }

}
