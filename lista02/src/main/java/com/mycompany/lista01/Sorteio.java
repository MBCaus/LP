package com.mycompany.lista01;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.text.TableView;

public class Sorteio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 100: ");
        Integer numero = leitor.nextInt();
        
        Integer par = 0;
        Integer impar = 0;
        Boolean sorteado = true;

        for (int i = 0; i < 200; i++) {
            
            Integer aleatorio = ThreadLocalRandom.current().nextInt(1, 100);

            if(aleatorio % 2 == 0) {
                par += 1;
            } else if(aleatorio % 2 == 1) {
                impar += 1;
            }
            
            if(aleatorio == numero && sorteado) {
                sorteado=false;
                
                System.out.println("O número sorteado apareceu" 
                                   + "pela primeira vez na posição: " + i);
            }
            
        }
        
        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números impares: " + impar);
        
        

    }
}
