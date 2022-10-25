package sptech.school.diagramas.testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.mycompany.exercicio.a.*;

public class MercadoTestes {

    private Carrinho carrinho;
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    private Produto produto4;

    @BeforeEach
    public void init() {
        this.produto1 = new Produto("PS5", "Video-Game", 4484.50);
        this.produto2 = new Produto("Fone", "Periférico", 20.50);
        this.produto3 = new Produto("Mouse", "Periférico", 35.90);
        this.produto4 = new Produto("Redmi MI 11", "Celular", 1155.50);
        this.carrinho = new Carrinho("Matheus");
    }

    @Test
    @DisplayName("adicionandoItensNoCarrinho(): Deve retornar 3 produtos no carrinho")
    void adicionandoItensNoCarrinho() {
        this.carrinho.adicionar(produto1);
        this.carrinho.adicionar(produto3);
        this.carrinho.adicionar(produto4);
        assertEquals(3, carrinho.getQuantidade());
    }

    @Test
    @DisplayName("realizarVenda(SEM DESCONTO):")
    void verificandoSeProdutoExisteNoCarrinho() {
        this.carrinho.adicionar(produto1);
        assertEquals(true, carrinho.existsPorNome("PS5"));
    }

    @Test
    @DisplayName("verificandoSeProdutoNaoExisteNoCarrinho():")
    void verificandoSeProdutoNaoExisteNoCarrinho() {
        this.carrinho.adicionar(produto1);
        assertEquals(false, carrinho.existsPorNome("Fone"));
    }

    @Test
    @DisplayName("pegandoQuantidadePorCategoria():")
    void pegandoQuantidadePorCategoria() {
        this.carrinho.adicionar(produto2);
        this.carrinho.adicionar(produto3);
        this.carrinho.adicionar(produto1);
        assertEquals(1, carrinho.getQuantidadePorCategoria("Video-Game"));
        assertEquals(2, carrinho.getQuantidadePorCategoria("Periférico"));
        assertEquals(0, carrinho.getQuantidadePorCategoria("Celualar"));
    }
    
    @Test
    @DisplayName("limpandoCarrinho():")
    void limpandoCarrinho() {
        this.carrinho.adicionar(produto1);
        this.carrinho.adicionar(produto1);
        this.carrinho.adicionar(produto3);
        this.carrinho.limpar();
        assertEquals(0, carrinho.getQuantidade());
    }
    
    @Test
    @DisplayName("removendoProdutoPorNome():")
    void removendoProdutoPorNome() {
        this.carrinho.adicionar(produto1);
        this.carrinho.adicionar(produto2);
        this.carrinho.adicionar(produto3);
        this.carrinho.removerPorNome("PS5");
        assertEquals(2, carrinho.getQuantidade());
    }
    
    @Test
    @DisplayName("pegandoProdutoPeloNome():")
    void pegandoProdutoPeloNome() {
        this.carrinho.adicionar(produto1);
        this.carrinho.adicionar(produto2);
        this.carrinho.adicionar(produto3);
        assertEquals(produto2, carrinho.getPorNome("Fone"));
    }
    
    @Test
    @DisplayName("pegandoValorTotal():")
    void pegandoValorTotal() {
        this.carrinho.adicionar(produto2);
        this.carrinho.adicionar(produto3);
        this.carrinho.adicionar(produto4);
        assertEquals(1211.9, carrinho.getValorTotal());
    }
}
