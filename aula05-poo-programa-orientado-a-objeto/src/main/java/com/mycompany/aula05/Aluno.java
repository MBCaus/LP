package com.mycompany.aula05;

public class Aluno {

    /*
        Modificadores de acesso:
    
            - default
            - private
            - public
            - protected
    
     */
    
    // Atributos
    private String ra;
    private String nome;
    public Double notaAc1 = 0.0;
    public Double notaAc2 = 0.0;

    public String getRa() {

        return this.ra;

    }

    public void setRa(String ra) {

        this.ra = ra;

    }
    
    public String getNome() {
        
        return this.nome;
        
    }
    
    public void setNome(String nome) {
        
        this.nome = nome;
        
    }

    public Double getNotaAc1() {
        return notaAc1;
    }

    public void setNotaAc1(Double notaAc1) {
        if(isNotaValida(notaAc1))
        this.notaAc1 = notaAc1;
    }

    public Double getNotaAc2() {
        return notaAc2;
    }

    public void setNotaAc2(Double notaAc2) {
        if(isNotaValida(notaAc2)) {
            this.notaAc2 = notaAc2;
        }
    }

    // Comportamento -> Métodos
    public Double getMedia() {

        return (notaAc1 + notaAc2 / 2);

    }
    
    private Boolean isNotaValida(Double nota) {
        return nota >= 0.0 && nota <= 10.0;
    }

}
