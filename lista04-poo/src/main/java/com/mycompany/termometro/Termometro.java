package com.mycompany.termometro;

public class Termometro {

    private Double temperaturaAtual;
    private Double temperaturaMax;
    private Double temperaturaMin;

    public Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Double getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(Double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public Double getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(Double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public void aumentaTemperatura(Double valor) {

        if (getTemperaturaMax() < valor + getTemperaturaAtual()) {

            setTemperaturaMax(getTemperaturaAtual() + valor);
            
            System.out.println(getTemperaturaMax());

        } else {

            setTemperaturaAtual(getTemperaturaAtual() + valor);
            
            System.out.println(getTemperaturaMax());

        }

    }

    public void diminuiTemperatura(Double valor) {

        if (getTemperaturaMin() > valor + getTemperaturaAtual()) {

            setTemperaturaMin(getTemperaturaAtual() + valor);
            
            System.out.println(getTemperaturaMin());

        }else {
        
            setTemperaturaAtual(getTemperaturaAtual() + valor);
            
            System.out.println(getTemperaturaMin());
            
        }

    }

    public void exibeFahreinheit() {

        Double fahreinheit = ((getTemperaturaAtual() * 1.8) + 32);
        
        System.out.println(fahreinheit);
        
    }

}
