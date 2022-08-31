package com.mycompany.lista03.supermercado;

public class CalcularDesconto {
    
    Double valor(Double valor, Integer quantidade) {
        
        if(quantidade == 1) {
           Double total = (quantidade * valor) * 0.90;
           return total;
        }else if(quantidade == 2) {
           Double total = (quantidade * valor) * 0.80;
           return total;
        }else{
           Double total = (quantidade * valor) * 0.70;
           return total;
        }
        
    }
    
    String exibirNotaFiscal(Double valor, Integer quantidade, Double total) {
     
        String fiscal = "--------------------------\n"
                      + "Valor do produto: R$" + valor + "\n"
                      + "Quantidade: " + quantidade + "\n"
                      + "--------------------------\n"
                      + "Valor com desconto: R$" + total;
        
        return fiscal;
        
    }
    
}
