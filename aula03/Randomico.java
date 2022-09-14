package com.example.demo;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Randomico {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        /*
            Anteriormente na jornada da programação:
            Math.random();
        
            Fato é:
            Math.random() * n -> Existe no Java!
        
            Existem outros, exemplo:
            Random x = new Random();
        
        */
        
//        Random geradorRandomico = new Random();
        
//        geradorRandomico.nextInt(10);
//        geradorRandomico.nextDouble();
//        geradorRandomico.nextBoolean();

        Integer inteiroGerado = ThreadLocalRandom.current().nextInt(0, 10);
        
        System.out.printf("Numero gerado: %d", inteiroGerado);
        
    }
}
