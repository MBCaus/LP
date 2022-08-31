package com.mycompany.lista03.supermercado;

import java.util.Scanner;

public class DescontoProgressivo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistem de desconto progressivo!");

        System.out.println("Digite o valor unitário do produto: ");
        Double valor = leitor.nextDouble();

        System.out.println("Digite a quantidade: ");
        Integer quantidade = leitor.nextInt();
               
        CalcularDesconto calculo = new CalcularDesconto();
        
        Double total = calculo.valor(valor, quantidade);
        
        System.out.println(calculo.exibirNotaFiscal(valor, quantidade, total));
        
    }

}
