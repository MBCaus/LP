package com.mycompany.emprego;

public class TesteEmprego {

    public static void main(String[] args) {
        
        Emprego emprego = new Emprego("João", "Analista de Sistemas", 5400.00);
        
        emprego.reajustarSalario(15.00);
        
    }
    
}
