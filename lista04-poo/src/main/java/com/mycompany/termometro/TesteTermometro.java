package com.mycompany.termometro;

public class TesteTermometro {

    public static void main(String[] args) {
        
        Termometro termometro = new Termometro(17.00, 23.00, 14.00);
        
        termometro.aumentaTemperatura(10.00);
        termometro.diminuiTemperatura(-10.00);
        termometro.exibeFahreinheit();
        
    }
    
}
