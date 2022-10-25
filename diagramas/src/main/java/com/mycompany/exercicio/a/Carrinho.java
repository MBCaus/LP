package com.mycompany.exercicio.a;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private String Cliente;
    private List<Produto> produtos = new ArrayList();

    public Carrinho(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public Integer getQuantidade() {
        return produtos.size();
    }

    public void adicionar(Produto add) {
        produtos.add(add);
    }

    public Boolean existsPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer quantidade = 0;
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCategoria().equals(nome)) {
                produtos.get(i).getCategoria();
                quantidade++;
            }
        }
        return quantidade;
    }

    public void limpar() {
        produtos.clear();
    }

    public void removerPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i);
            }
        }
    }

    public Produto getPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                return produtos.get(i);
            }
        }
        return null;
    }

    public Double getValorTotal() {
        Double valorTotal = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            valorTotal += produtos.get(i).getPreco();
        }
        return valorTotal;
    }

}
