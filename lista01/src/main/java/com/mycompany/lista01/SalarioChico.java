package com.mycompany.lista01;

import java.util.Scanner;

public class SalarioChico {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu salário bruto:");
        Double bruto = leitor.nextDouble();

        System.out.println("Digite quanto custa a condução diária apenas de ida: ");
        Double conducao = leitor.nextDouble();
        
        Double INSS = 0.1 * bruto;
        Double IR = 0.2 * bruto;
        Double VT = (conducao * 2)  * 22;
        Double descontos = INSS + IR + VT;
        Double total = bruto - descontos;
        
        System.out.println("Seu salário bruto é R$" 
                + bruto + ", tem um total de R$" 
                + descontos + " em descontos e receberá um líquido de R$" 
                + total);

    }

}
