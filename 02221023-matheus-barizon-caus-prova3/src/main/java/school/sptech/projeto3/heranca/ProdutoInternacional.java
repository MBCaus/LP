package school.sptech.projeto3.heranca;

public class ProdutoInternacional extends Produto {
    
    public ProdutoInternacional(Integer id, String nome, String categoria, Double preco, Double precoFrete) {
        super(id, nome, categoria, preco);
    }

    @Override
    public Double getPreco() {
        return super.getPreco() + (super.getPreco() * 0.6);
    }
}
