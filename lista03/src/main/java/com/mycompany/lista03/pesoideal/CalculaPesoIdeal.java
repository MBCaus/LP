package com.mycompany.lista03.pesoideal;

public class CalculaPesoIdeal {

    Double calculo(String sexo, Double altura) {
        
        if(sexo.equals("M")) {
            
            Double peso = (62.1 * altura) - 44.7;
            
            return peso;
            
        }else {
            
            Double peso = (72.7 * altura) - 58;
            
            return peso;
        }
        
    }
    
}
