package school.sptech.exercicio.classe.abstrata;

public class Vendedor extends Funcionario{

    private Double vendas;
    private Double taxas;

    public Vendedor(String cpf, String nome, Double vendas, Double taxas) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxas = taxas;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxas() {
        return taxas;
    }

    public void setTaxas(Double taxas) {
        this.taxas = taxas;
    }
    
    
    
    @Override
    public Double calcSalario() {
        return vendas + taxas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vendedor: ").append("\n");
        sb.append("vendas: ").append(vendas).append("\n");
        sb.append("taxas: ").append(taxas).append("\n");
        sb.append("\n");
        return sb.toString();
    }
    
}
