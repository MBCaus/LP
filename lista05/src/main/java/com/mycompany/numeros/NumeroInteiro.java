package com.mycompany.numeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroInteiro {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList();

        Integer pararLaco = 1;

        while (pararLaco != 0) {

            System.out.println("Digite um número inteiro: ");
            Integer numero = leitor.nextInt();

            if (numero.equals(0)) {

                pararLaco = 0;

            } else {

                numeros.add(numero);

            }

        }

        System.out.println("-".repeat(30));
        System.out.println("Números pares do vetor: ");

        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i) % 2 == 0) {

                System.out.println(numeros.get(i));

            }

        }

        System.out.println("-".repeat(30));
        System.out.println("Números inpares do vetor: ");

        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i) % 2 == 1) {

                System.out.println(numeros.get(i));

            }

        }

        System.out.println("-".repeat(30));

        Integer soma = 0;

        for (Integer numero : numeros) {

            soma += numero;

        }

        System.out.println("Soma de todos os números da Lista: " + soma);

        System.out.println("-".repeat(30));

        Integer menorNumero = 99999;

        for (Integer numero : numeros) {

            if (numero < menorNumero) {

                menorNumero = numero;

            }

        }

        System.out.println("Menor número da Lista: " + menorNumero);

        System.out.println("-".repeat(30));

        Integer maiorNumero = -99999;

        for (Integer numero : numeros) {

            if (numero > maiorNumero) {

                maiorNumero = numero;

            }

        }

        System.out.println("Maior número da Lista: " + maiorNumero);

    }

}
