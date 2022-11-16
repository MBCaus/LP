package school.sptech.exercicio.classe.abstrata;

public abstract class Funcionario{

    private String cpf;
    private String nome;

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract Double calcSalario();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario: ").append("\n");
        sb.append("cpf: ").append(cpf).append("\n");
        sb.append("nome: ").append(nome).append("\n");
        sb.append("\n");
        return sb.toString();
    }
    
}
