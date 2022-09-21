package com.mycompany.emprego;

public class Emprego {

    private String nome;
    private String cargo;
    private Double salario;

    public Emprego(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void reajustarSalario(Double porcentagem) {
        
        Double reajuste = getSalario() + (getSalario()*(porcentagem / 100));
        
        nome = getNome();
        cargo = getCargo();
        salario = getSalario();
        
        System.out.printf("Nome: %s          \n"
                        + "Cargo: %s         \n"
                        + "Salario: %.2f     \n"
                        + "------------------\n"
                        + "Sálario reajustado: %.2f"
                    , nome, cargo, salario, reajuste);
        
    }
    
}
