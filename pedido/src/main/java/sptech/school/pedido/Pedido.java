package sptech.school.pedido;

public class Pedido {

    public static final Double TAXA_TRIBUTO = 0.3;
    
    private Lanche lanche;
    private Bebida bebida;
    private Acompanhamento acompanhamento;

    public Pedido() {
        this.lanche = lanche;
        this.bebida = bebida;
        this.acompanhamento = acompanhamento;
    }
    
    public Double getTotal(Lanche lanche, Bebida bebida, Acompanhamento acompanhamento){
        
        Double precoTotal = (lanche.getPreco() + bebida.getPreco() + acompanhamento.getPreco());
    
        return  precoTotal + (precoTotal * TAXA_TRIBUTO);
        
    }

    public Lanche getLanche() {
        return lanche;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }
    
    
    
}
