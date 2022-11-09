package com.mycompany.heranca;

public class App {

    public static void main(String[] args) {
        
        Departamento dept = new Departamento("EletroYag");
        VendedorComissao vendedor1 = new VendedorComissao(1, "Gabriel", 1_500.0, 200.0);
        VendedorComissaoMaisFixo vendedor2 = new VendedorComissaoMaisFixo(2, "Pedro", 1_500.0, 200.0, 5_000.0);
        
        dept.adicionaVendedor(vendedor1);
        dept.adicionaVendedor(vendedor2);
        
        System.out.println("Total: " + dept.getQuantidadeVendedores());
        
        System.out.println("Sálario: " + dept.calcularTotalSalario());
    }
    
}
