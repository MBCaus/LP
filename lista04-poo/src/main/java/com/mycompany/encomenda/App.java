package com.mycompany.encomenda;

public class App {

    public static void main(String[] args) {
        
        Encomenda encomenda = new Encomenda("G", "Rua Pequi da Silva", "Rua Guarniçal Pereira", 56.78, 50.00);
        
        
        encomenda.calcularFrete("G", 50.00, 56.78);
        encomenda.emitirEtiqueta();
        
    }
    
}
