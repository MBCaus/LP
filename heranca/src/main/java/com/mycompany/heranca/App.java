package com.mycompany.heranca;

public class App {

    public static void main(String[] args) {

        VendedorComissao vendedorComissao = new VendedorComissao(1, "Matheus", 0.0, 0.0);

        VendedorComissaoMaisFixo vendedorComissaoMaisFixo = new VendedorComissaoMaisFixo(2,
                "Matheus", 200.0, 5.0, 800.0);

        System.out.println(vendedorComissao.calcularSalario());
        
        System.out.println(vendedorComissaoMaisFixo.calcularSalario());

    }

}
