package com.mycompany.heranca;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private List<VendedorComissao> vendedores = new ArrayList();
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionaVendedor(VendedorComissao vendedor) {

        vendedores.add(vendedor);

    }

    public Integer getQuantidadeVendedores() {

        return vendedores.size();

    }

    public Double calcularTotalSalario() {

        Double valorTotal = 0.0;

        for (int i = 0; i < vendedores.size(); i++) {

            valorTotal += vendedores.get(i).calcularSalario();

        }

        return valorTotal;

    }

    public Integer getQuantidadeFixos() {

        Integer total = 0;

        for (VendedorComissao vendedor : vendedores) {

            if (vendedor instanceof VendedorComissaoMaisFixo) {

                total++;

            }

        }

        return total;

    }

}
