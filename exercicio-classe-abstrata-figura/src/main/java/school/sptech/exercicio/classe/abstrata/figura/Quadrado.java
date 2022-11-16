package school.sptech.exercicio.classe.abstrata.figura;

public class Quadrado extends Figura{

    private Double lado;

    public Quadrado(String cor, Integer espessura, Double lado) {
        super(cor, espessura);
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quadrado ").append("\n");
        sb.append("lado: ").append(lado);
        return sb.toString();
    }
    
}
