package com.mycompany.lista01;

import java.util.Scanner;

public class ContadorVariado {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        for (Double numero = 0.15; numero < 5; numero += 0.15) {
            
            System.out.printf("%.2f \n", numero);  
            
        }
        
    }
    
}
