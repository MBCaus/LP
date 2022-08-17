package com.mycompany.lista01;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10: ");
        Integer numero = leitor.nextInt();

        Integer contador = 0;

        while (true) {

            Integer aleatorio = ThreadLocalRandom.current().nextInt(0, 10);

            if (aleatorio != numero) {
                System.out.println("O número sorteado foi: " + aleatorio);
                contador += +1;
            } else if (contador <= 3) {
                System.out.println("O número sorteado foi: " + aleatorio);

                System.out.println("Você é MUITO sortudo.");
                break;
            } else if (contador <= 10) {
                System.out.println("O número sorteado foi: " + aleatorio);

                System.out.println("Você é sortudo.");
                break;
            } else {
                System.out.println("O número sorteado foi: " + aleatorio);

                System.out.println("É melhor você parar de apostar e ir trabalhar");
                break;
            }

        }

    }
}
