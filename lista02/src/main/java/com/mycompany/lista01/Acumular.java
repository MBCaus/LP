package com.mycompany.lista01;

import java.util.Scanner;

public class Acumular {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer numero = leitor.nextInt();

        Integer total = 0;

        total += numero;

        while (numero != 0) {

            System.out.println("Digite um número: ");
            numero = leitor.nextInt();

            total += numero;

        }

        System.out.println("A soma total foi de: " + total);

    }
}
