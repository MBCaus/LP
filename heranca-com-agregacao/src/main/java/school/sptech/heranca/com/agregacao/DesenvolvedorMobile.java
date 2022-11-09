package school.sptech.heranca.com.agregacao;

public class DesenvolvedorMobile extends Desenvolvedor {

    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHorasTrabalhadasMobile;

    public DesenvolvedorMobile(String nome, Integer qtdHorasTrabalhadas,
            Double valorHorasTrabalhadas, Integer qtdHorasTrabalhadasMobile,
            Double valorHorasTrabalhadasMobile) 
    {
        super(nome, qtdHorasTrabalhadas, valorHorasTrabalhadas);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhadasMobile;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + (this.valorHorasTrabalhadas * this.qtdHorasTrabalhadas);
    }

    @Override
    public String toString() {
        
        String textoDesenvolvedorMobile = String.format(
        "Nome do desenvolvedor: %s \n"
      + "Quantidade de horas trabalhadas no mobile: %d \n"
      + "Valor das horas trabalhadas no mobile: %2.f \n"
      + "Total do salário: %2.f",
        super.nome, this.qtdHorasTrabalhadasMobile,
        this.valorHorasTrabalhadasMobile, this.getSalario());
        
        return textoDesenvolvedorMobile;
    }
    
    
    
}
