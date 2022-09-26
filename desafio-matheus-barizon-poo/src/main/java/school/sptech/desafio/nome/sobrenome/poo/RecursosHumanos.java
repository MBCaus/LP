package school.sptech.desafio.nome.sobrenome.poo;

public class RecursosHumanos {

    private Integer quantidadePromovidos;
    private Integer quantidadeReajustes;

    public RecursosHumanos(Integer quantidadePromovidos, Integer quantidadeReajustes) {
        this.quantidadePromovidos = quantidadePromovidos;
        this.quantidadeReajustes = quantidadeReajustes;
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
    
}
