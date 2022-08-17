package com.mycompany.lista01;

import java.util.Scanner;

public class NumeroImpar {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i <= 90; i++) {
            
            if(i % 2 == 1) {
                System.out.println(i);
            }
            
        }
        
    }
}
