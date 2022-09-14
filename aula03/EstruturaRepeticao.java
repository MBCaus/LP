package com.example.demo;

import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {

            System.out.println("Número: " + i);

        }

        System.out.println("-".repeat(15));

        for (int i = 10; i >= 0; i--) {
            System.out.println("Número: " + i);
        }

        System.out.println("-".repeat(15));

        Integer i = 0;

        while (true) {

            System.out.println("Número: " + i);

            if (i == 10) {
                break;
            }

            i++;

        }

        System.out.println("-".repeat(15));

        Integer j = 10;

        while (true) {

            System.out.println("Número: " + j);

            if (j == 0) {
                break;
            }

            j--;

        }

    }
}
