package com.mycompany.aula05;

import java.util.Scanner;

//  Uma classe é como uma folha em branco.

public class ContaCorrente {
    
    // Estes são atributos de instância. - Usaremos esta estratégia.
    // Existem também os atributos de classe.
    
    private Double saldo;
    private String numero;
    private String titular;

    public ContaCorrente(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    // Coloca um Construtor "Default"
    public ContaCorrente() {    
    }
    
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo += saldo;
    }
    
    public void deposito(Double saldo) {
        if(saldo > 0) {
            this.saldo += saldo;
        }else {
            System.out.println("Valor invalido.");
        }
    }
    
    public void saque(Double saldo) {
        if(saldo <= this.saldo && saldo > 0) {
            this.saldo -= saldo;
        }else {
            System.out.println("Valor invalido.");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    
}
