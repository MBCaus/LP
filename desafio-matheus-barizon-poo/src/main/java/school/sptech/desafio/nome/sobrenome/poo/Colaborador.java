package school.sptech.desafio.nome.sobrenome.poo;

public class Colaborador {

    private String nome;
    private String cargo;
    private Double salario;

    public Colaborador(String nome, String cargo, Double salario) {
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

    RecursosHumanos recursosHumanos = new RecursosHumanos(0, 0);

    public void reajustarSalario(String colaborador, Double porcentagem) {

        if (porcentagem <= 0 || colaborador.equals("")) {

            System.out.println("informações invalidas, por favor digite novamente.");

        } else {

            setSalario(getSalario() + getSalario() * porcentagem);

            System.out.println("O sálario de " + colaborador + " Foi reajustado para: R$" + this.salario);

            recursosHumanos.maisReajuste();

        }

    }

    public void promoverColaborador(String colaborador, String novoCargo, Double novoSalario) {

        if (colaborador.equals("") || novoCargo.equals("") || novoSalario <= this.salario) {

            System.out.println("informações invalidas, por favor digite novamente.");

        } else {

            System.out.println("O colaborador " + colaborador + " do Cargo " + novoCargo + " foi promovido com sucesso.");
            
            recursosHumanos.maisPromovidos();
            
        }

    }

}
