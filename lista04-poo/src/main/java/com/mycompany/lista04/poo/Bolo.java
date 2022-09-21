package com.mycompany.lista04.poo;

public class Bolo {
    
    private String sabor;
    private Double valor;
    private Integer quantidadeVendida;
    
    public Bolo(String sabor, Double valor, Integer quantidadeVendida) {
        this.sabor = sabor;
        this.valor = valor;
        this.quantidadeVendida = quantidadeVendida;
    }
    
    public String getSabor() {
        return sabor;
    }
    
    public void setSabor(String sabor) {
        
        if (sabor.equals("Morango") || sabor.equals("Chocolate") || sabor.equals("Abacaxi")) {
            
            this.sabor = sabor;
            
        } else {
            System.out.println("Sabor invalido, sabores disponiveis: Morango, Chocolate e Abacaxi");
        }
        
    }
    
    public Double getValor() {
        return valor;
    }
    
    public void setValor(Double valor) {
        
        if (valor >= 30.00 && valor <= 50.00) {
            
            this.valor = valor;
            
        } else {
            
            System.out.println("Valor invalido, digite um valor entre 30,00 e 50,00 R$ \n");
            
        }
        
    }
    
    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }
    
    public void setQuantidadeVendida(Integer quantidadeVendida) {
        
        if (quantidadeVendida <= 100) {
            
            this.quantidadeVendida = quantidadeVendida;
            
        } else {
            
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
            
        }
        
    }
    
    public void comprarBolo(Integer quantiaBolo) {
        
        if (quantiaBolo <= 100) {
            
            this.quantidadeVendida += quantiaBolo;
            
            exibirRelatorio(sabor, quantidadeVendida, valor);
            
        } else {
            
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
            
        }
        
    }
    
    public void exibirRelatorio(String sabor, Integer quantidadeVendida, Double valor) {
        
        Double lucro = valor * quantidadeVendida;
        
        System.out.printf("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f \n", sabor, quantidadeVendida, lucro);
        
    }
    
}
