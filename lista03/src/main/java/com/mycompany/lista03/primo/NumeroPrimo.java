package com.mycompany.lista03.primo;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (true) {

            System.out.println("Digite um número inteiro: ");
            Integer numero = leitor.nextInt();

            if (numero <= 0) {
                break;
            }

            VerificarPrimo primo = new VerificarPrimo();

            primo.primo(numero);

        }

    }

}
