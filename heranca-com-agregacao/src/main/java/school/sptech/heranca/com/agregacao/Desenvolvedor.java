package school.sptech.heranca.com.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor {

    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHorasTrabalhadas;

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHorasTrabalhadas) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHorasTrabalhadas = valorHorasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {

        return this.valorHorasTrabalhadas * this.qtdHorasTrabalhadas;

    }

    @Override
    public String toString() {
        
        String textoDesenvolvedor = String.format(
        "Nome do desenvolvedor: %s \n"
      + "Quantidade de horas trabalhadas: %d \n"
      + "Valor das horas trabalhadas %2.f \n"
      + "Total do pagamento: %2.f", 
        this.nome, this.qtdHorasTrabalhadas, this.valorHorasTrabalhadas,
        getSalario());
        
        return textoDesenvolvedor;
    }
    
    

}
