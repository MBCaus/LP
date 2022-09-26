package com.mycompany.lista05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frutas {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<String> frutas = new ArrayList();

        frutas.add("Uva");
        frutas.add("Abacaxi");
        frutas.add("Amora");
        frutas.add("Melancia");
        frutas.add("Maracuja");
        frutas.add("Jaca");

        System.out.println("Digite a fruta que procura: ");
        String nomeFruta = leitor.nextLine();

        if (frutas.contains(nomeFruta)) {

            System.out.println("A fruta " + nomeFruta + " esxiste na Lista.");

        } else {

            System.out.println("A fruta " + nomeFruta + " não esxiste na Lista.");

        }

    }
}
