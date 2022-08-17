package com.example.demo;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 7: ");
        Integer numero = leitor.nextInt();
        
        String diaDaSemana;
        
        switch (numero) {
            case 1:
                diaDaSemana = "Domingou...";
                break;
            case 2:
                diaDaSemana = "Segundou...";
                break;
            case 3:
                diaDaSemana = "Terça...";
                break;
            case 4:
                diaDaSemana = "Dia de LP...";
                break;
            case 5:
                diaDaSemana = "Quinta TBT - (Quase sexta)...";
                break;
            case 6:
                diaDaSemana = "Sextou...";
                break;
            case 7:
                diaDaSemana = "Sabadaço com Gilberto (KASINO)";
                break;
            default:
                diaDaSemana = "Dia invalido...";
                break;
        }
        
        System.out.println(diaDaSemana);
        
    }
}
