package school.sptech.exercicio.classe.abstrata;

public class Horista extends Funcionario{

    private Integer qtdHora;
    private Double valorHora;

    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    public Integer getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(Integer qtdHora) {
        this.qtdHora = qtdHora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    
    @Override
    public Double calcSalario() {
        return valorHora * qtdHora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Horista: ").append("\n");
        sb.append("qtdHora: ").append(qtdHora).append("\n");
        sb.append("valorHora: ").append(valorHora).append("\n");
        sb.append("\n");
        return sb.toString();
    }
    
}
