package com.mycompany.lista03.primo;

public class VerificarPrimo {

    void primo (Integer numero) {
        
        Integer qtd = 0;
        
        for (int i = 1; i <= numero; i++) {
            
            if(numero % i == 0) {
                qtd++;
            }
            
        }
        
        if(qtd <= 2) {
            System.out.println("O número é Primo!");
        } else {
            System.out.println("Não é Primo...");
        }
        
    }
    
}
