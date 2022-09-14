package com.mycompany.projeto04;

import java.util.Scanner;
import jdk.jshell.execution.Util;

public class App {

    public static void main(String[] args) {

        Utilitaria util = new Utilitaria();
        
        Calculadora calculo = new Calculadora();
        
        // Objeto ou instancia
        Scanner leitor = new Scanner(System.in);

//        util.exibirLinha();
//        System.out.println("Matheus");
//        util.exibirLinha();
//        System.out.println("Barizon");
//        util.exibirLinha();
//        
//        System.out.println("Digite seu nome");
//        String amam = leitor.nextLine();
//        util.exibirNome(tendi);

//        util.exibirNomeComLinha(amam);

        System.out.println("Digite um número: ");
        Double numero1 = leitor.nextDouble();

        System.out.println("Digite outro número: ");
        Double numero2 = leitor.nextDouble();
        
        System.out.println("Digite mais um número: ");
        Double numero3 = leitor.nextDouble();
        
//        Integer resultado = calculo.soma(numero1, numero2, numero3);
        
        Double resul = calculo.soma(numero1, numero2, numero3);
        
//        System.out.println("Resultado: " + resultado);

        System.out.println("Resultado: " + resul);

    }

}
