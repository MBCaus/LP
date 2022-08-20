package com.mycompany.lista01;

import java.util.Scanner;

public class SaborFavorito {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual a melhor Pizza?");
        System.out.println("Para escolher a melhor pizza, digite:");
        System.out.println("5 para Mussarela");
        System.out.println("25 para Calabresa");
        System.out.println("50 para Quatro queijos");
        
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer queijo = 0;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Qual sabor deseja votar? ");
            Integer votacao = leitor.nextInt();
            
            if(votacao != 5 && votacao != 25 && votacao != 50) {
                System.out.println("Por favor, coloque um número dentre"
                + " 5, 25 e 50.");
            } else {
                switch (votacao) {
                case 5:
                    mussarela += 1;
                    break;
                case 25:
                    calabresa += 1;
                    break;
                default:
                    queijo += 1;
                    break;
            }
            }
            
        }
        
        System.out.println("Votação encerrada.");
        
        System.out.println("Os votos foram: ");
        System.out.println("Mussarela: " + mussarela);
        System.out.println("Calabresa: " + calabresa);
        System.out.println("Quatro Queijos: " + queijo);
        
        if(mussarela > calabresa && mussarela > queijo) {
            System.out.println("De acordo com a pesquisa o sabor Mussarela é "
                    + "O mais votado.");
        }else if(calabresa > mussarela && calabresa > queijo) {
            System.out.println("De acordo com a pesquisa o sabor Calabresa é "
                    + "O mais votado.");
        }else if(queijo > mussarela && queijo > calabresa) {
            System.out.println("De acordo com a pesquisa o sabor Quatro Queijos é "
                    + "o mais votado.");
        }else if(mussarela == calabresa) {
            System.out.println("Os sabores Mussarela e Calabresa empataram.");
        }else if(mussarela == queijo) {
            System.out.println("Os sabores Mussarela e Quatro queijos empataram.");
        }else {
            System.out.println("Os sabores Calabresa e Quatro queijos empataram.");
        }
        
    }
    
}
