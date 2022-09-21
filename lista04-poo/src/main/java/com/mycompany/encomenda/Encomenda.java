package com.mycompany.encomenda;

public class Encomenda {

    private String tamanho;
    private String remetente;
    private String destinatario;
    private Double distancia;
    private Double valor;

    public Encomenda(String tamanho, String remetente, String destinatario, Double distancia, Double valor) {
        this.tamanho = tamanho;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.distancia = distancia;
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {

        if (tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G")) {

            this.tamanho = tamanho;

        } else {

            System.out.println("Tamanho indisponivel, tamanhos: P, M e G");

        }

    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double calcularFrete(String tamanho, Double distancia, Double valor) {

        Double vTamanho = 0.0;
        Double vDistancia = 0.0;

        if (tamanho.equals("P")) {

            vTamanho = valor * 0.01;

        } else if (tamanho.equals("M")) {

            vTamanho = valor * 0.03;

        } else {

            vTamanho = valor * 0.05;

        }

        if (distancia <= 200) {

            if (distancia <= 50) {

                vDistancia = 3.00;

            } else {

                vDistancia = 5.00;

            }

        } else {

            vDistancia = 7.00;

        }
        
        return vDistancia + vTamanho;

    }
    
    public void emitirEtiqueta(){
        
        tamanho = getTamanho();
        remetente = getRemetente();
        destinatario = getDestinatario();
        valor = getValor();
        Double valorFrete = calcularFrete(tamanho, distancia, valor);
        Double valorTotal = valorFrete + valor;

       
        System.out.printf("***** ETIQUETA PARA ENVIO ***** \n "
                        + "Enderesso do remetente: %s      \n "
                        + "EndereÃ§o do destinatário: %s   \n "
                        + "Tamanho: %s                     \n "
                        + "------------------------------- \n "
                        + "Valor encomenda: R$ %.2f        \n "
                        + "Valor frete: R$ %.2f "
                     + "\n ------------------------------- \n "
                        + "Valor total: R$ %.2f            \n "
                , remetente, destinatario, tamanho, valor, valorFrete, valorTotal);
    }

}
