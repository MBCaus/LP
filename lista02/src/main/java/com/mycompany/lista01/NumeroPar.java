package com.mycompany.lista01;

import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i <= 40; i++) {
            
            if(i % 2 == 0) {
                System.out.println(i);
            }
            
        }
        
    }
}
