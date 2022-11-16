package school.sptech.exercicio.classe.abstrata.figura;

public class App {

    public static void main(String[] args) {
        
        Quadrado quadrado = new Quadrado("vermelho", 10, 10.0);
        Retangulo retangulo = new Retangulo("azul", 20, 5.5, 10.0);
        Triangulo triangulo = new Triangulo("amarelo", 6, 7.8, 3.5);
        Circulo circulo = new Circulo("verde", 3, 30.0);
        
        Imagem imagem = new Imagem();
        
        // adicionando figuras
        
        imagem.adicionarFigura(quadrado);
//        imagem.adicionarFigura(retangulo);
//        imagem.adicionarFigura(triangulo);
//        imagem.adicionarFigura(circulo);
        
        // exibindo figuras
        
        imagem.exibeFiguras();
        
        // exibindo soma das areas
        
//        imagem.exibeSomaArea();
        
        
        
    }
    
}
