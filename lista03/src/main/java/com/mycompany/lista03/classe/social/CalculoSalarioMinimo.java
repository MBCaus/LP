package com.mycompany.lista03.classe.social;

public class CalculoSalarioMinimo {

    Double salariosMinimos(Double renda) {
        
         Double qtdSalarios = renda / 1045;
         
         return qtdSalarios;
        
    }
    
    String classePertencente(Double qtdSalarios) {
        
        if(qtdSalarios <= 2) {
            String classeE = "você pertence a classe E";
            return classeE;
        }else if(qtdSalarios <= 4) {
            String classeD = "você pertence a classe D";
            return classeD;
        }else if(qtdSalarios <= 10) {
            String classeC = "você pertence a classe C";
            return classeC;
        }else if(qtdSalarios <= 20) {
            String classeB = "você pertence a classe B";
            return classeB;
        }else {
            String classeA = "você pertence a classe A";
            return classeA;
        }
    }
}
