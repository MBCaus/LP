package school.sptech.projeto.abstrato;

public class AlunoAds extends Aluno {

    private Double notaContinuada;
    private Double notaIntegrada;

    public AlunoAds(String ra, String nome, Double notaContinuada, Double notaIntegrada) {
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nome: ").append(super.getNome()).append("\n");
        sb.append("notaContinuada: ").append(notaContinuada).append("\n");
        sb.append("notaIntegrada: ").append(notaIntegrada).append("\n");
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public Double getMedia() {
        return (notaContinuada + notaIntegrada) / 2;
    }

}
