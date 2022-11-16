package school.sptech.exercicio.classe.abstrata.figura;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    List<Figura> figuras = new ArrayList();
    
    public void adicionarFigura(Figura figura){
        figuras.add(figura);
    }
    
    public void exibeFiguras() {
        for (Figura figura : figuras) {
            System.out.println(figura);
            System.out.println(String.format("Cálculo da áreal: %.2f", figura.calcularArea()));
        }
    }
    
    public void exibeSomaArea() {
        Double totalArea = 0.0;
        for (Figura figura : figuras) {
            totalArea += figura.calcularArea();
            System.out.println(totalArea);
        }
    }
    
    public void exibeFiguraAreaMaior20() {
        for (Figura figura : figuras) {
            if(figura.calcularArea() > 20) {
                System.out.println(figura);
            }
        }
    }
    
    public void exibeQuadrado(){
        for (Figura figura : figuras) {
            if(figura instanceof Quadrado) {
                System.out.println(figura);
            }
        }
    }
    
}
