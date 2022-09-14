package com.mycompany.aula05;

public class ExemploConstrutor {

    public static void main(String[] args) {
        
        ContaCorrente contaCorrente1 = new ContaCorrente("Matheus", "02221023");
        ContaCorrente contaCorrente2 = new ContaCorrente();
        
        System.out.println(contaCorrente1.getTitular());
        System.out.println(contaCorrente1.getNumero());
        
        System.out.println("-".repeat(30));
        
        System.out.println(contaCorrente2.getTitular());
        System.out.println(contaCorrente2.getNumero());
        
    }
    
}
