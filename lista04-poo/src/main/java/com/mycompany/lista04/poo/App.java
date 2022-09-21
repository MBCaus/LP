package com.mycompany.lista04.poo;

public class App {

    public static void main(String[] args) {

        Bolo boloMorango = new Bolo("Morango", 30.00, 0);
        Bolo boloChocolate = new Bolo("Chocolate", 40.00, 0);
        Bolo boloAbacaxi = new Bolo("Abacaxi", 35.00, 0);

        boloMorango.comprarBolo(1);
        boloChocolate.comprarBolo(1);
        boloAbacaxi.comprarBolo(1);
        boloAbacaxi.comprarBolo(1);
        boloChocolate.comprarBolo(1);

    }

}
