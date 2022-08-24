package com.mycompany.projeto04;

public class Utilitaria {

    /* 
        Assinatura do método é composta por:
    
            - tipo de retorno
            - nome do método
            - paramétros -> argumentos
            - função -> método
    
        Nesse caso void indica que o método não possui retorno.
    
    */
    
    void exibirLinha() {

        System.out.println("-".repeat(30));

    }

    void exibirNome(String nome) {

        System.out.println(String.format("**** %s ****", nome));
        
    }
    
    void exibirNomeComLinha(String amogos) {
        
        exibirLinha();
        exibirNome(amogos);
        exibirLinha();
    }
    
    /*
          Um método pode invocar outros métodos, da mesma forma Classe ou até
        mesmo de outras.
    */

}
