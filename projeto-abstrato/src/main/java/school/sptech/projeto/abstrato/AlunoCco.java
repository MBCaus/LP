package school.sptech.projeto.abstrato;

public class AlunoCco extends Aluno{

    private Double notaIntegrada;
    private Double notaMonografia;

    public AlunoCco(String ra, String nome, Double notaIntegrada, Double notaMonografia) {
        super(ra, nome);
        this.notaIntegrada = notaIntegrada;
        this.notaMonografia = notaMonografia;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }
    
    @Override
    public Double getMedia() {
        return (notaIntegrada * 0.4) + (notaMonografia * 0.6);
    }
    
}
