package school.sptech.desafio.nome.sobrenome.poo;

public class RecursosHumanos {

    private Integer quantidadePromovidos;
    private Integer quantidadeReajustes;

    public RecursosHumanos() {
        this.quantidadePromovidos = 0;
        this.quantidadeReajustes = 0;
    }

    public Integer getQuantidadePromovidos() {
        return quantidadePromovidos;
    }

    public void setQuantidadePromovidos(Integer quantidadePromovidos) {
        this.quantidadePromovidos = quantidadePromovidos;
    }

    public Integer getQuantidadeReajustes() {
        return quantidadeReajustes;
    }

    public void setQuantidadeReajustes(Integer quantidadeReajustes) {
        this.quantidadeReajustes = quantidadeReajustes;
    }

    public void maisPromovidos() {

        setQuantidadePromovidos(quantidadePromovidos + 1);

        System.out.println("");
        System.out.println("Quantidade de Promoções: " + this.quantidadePromovidos);

    }

    public void maisReajuste() {

        setQuantidadeReajustes(quantidadeReajustes + 1);

        System.out.println("");
        System.out.println("Quantidade de Reajustes: " + this.quantidadeReajustes);

    }

    public void reajustarSalario(Colaborador cl, Double porcentagem) {

        if (cl != null && porcentagem != null && porcentagem > 0) {

            cl.setSalario(cl.getSalario() * (porcentagem / 100) + cl.getSalario());

            System.out.println("O sálario de " + cl.getNome() 
                               + " Foi reajustado para: R$" 
                               + cl.getSalario());

            maisReajuste();

        } else {

            System.out.println("informações invalidas, por favor digite novamente.");

        }

    }

    public void promoverColaborador(Colaborador cl, String novoCargo, Double novoSalario) {

        if (cl != null && novoCargo != null && novoSalario != null && novoSalario > cl.getSalario()) {

            cl.setCargo(novoCargo);
            cl.setSalario(novoSalario);
            
            System.out.println("O colaborador " + cl.getNome() 
                               + " do Cargo " + cl.getCargo() 
                               + " foi promovido com sucesso.");
            
            maisPromovidos();

        } else {

            System.out.println("informações invalidas, por favor digite novamente.");

        }

    }

}
