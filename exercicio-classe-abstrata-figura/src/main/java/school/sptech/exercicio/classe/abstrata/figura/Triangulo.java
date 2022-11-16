package school.sptech.exercicio.classe.abstrata.figura;

public class Triangulo extends Figura{

    private Double base;
    private Double altura;

    public Triangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Triangulo ").append("\n");
        sb.append("base: ").append(base).append("\n");
        sb.append("altura: ").append(altura);
        return sb.toString();
    }
    
}
