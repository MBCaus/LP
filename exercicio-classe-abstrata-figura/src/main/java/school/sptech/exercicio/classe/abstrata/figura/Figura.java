package school.sptech.exercicio.classe.abstrata.figura;

public abstract class Figura {

    private String cor;
    private Integer espessura;

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }
    
    public abstract Double calcularArea();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura: ").append("\n");
        sb.append("cor: ").append(cor).append("\n");
        sb.append("espessura: ").append(espessura).append("\n");
        return sb.toString();
    }
    
}
