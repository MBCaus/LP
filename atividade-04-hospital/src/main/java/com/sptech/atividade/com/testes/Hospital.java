package com.sptech.atividade.com.testes;

public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos = 0;
    private Integer quantidadeDeHoraExtra = 0;

    public Hospital(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }

    public void realizarPagamento(Medico medico, Double valorPago) {
        
        
        
    }
    
    public void realizarPagamento(Medico medico, Double valorPago, Double horaExtra) {
    
        
        
    }
    
    public void desligarMedico(Medico medico) {
    
        
    
    }

}
