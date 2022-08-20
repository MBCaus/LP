package com.mycompany.lista01;

import java.util.Scanner;

public class ValorPotencia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (true) {

            System.out.println("Digite o valor da base: ");
            Integer base = leitor.nextInt();

            System.out.println("Digite o valor do expoente: ");
            Integer expoente = leitor.nextInt();

            if (expoente < 0) {
                System.out.println("Digite apenas expoentes positivos");
            } else if (base == 1) {
                System.out.println("O valor final é: " + base);
            } else {

                Integer potencia = 1;

                for (int i = 0; i < expoente; i++) {

                    potencia *= base;

                }

                System.out.println("O valor de " + base + " elevado a " 
                        + expoente + " = " + potencia);

            }

        }

    }

}
