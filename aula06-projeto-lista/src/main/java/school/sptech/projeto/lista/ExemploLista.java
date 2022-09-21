package school.sptech.projeto.lista;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {

    public static void main(String[] args) {

        /*
        
        List listaLoka = new ArrayList();
        
        listaLoka.add("Matheus");
        listaLoka.add(18);
        listaLoka.add(true);
        listaLoka.add(1.78);
        
        for (int i = 0; i < listaLoka.size(); i++) {
            
            System.out.println(listaLoka.get(i));
            System.out.println("");
            
        }
        
        NÃO FAÇA ISSO!! (é permitido, porém não é recomendado, muito pelo contrario, é horrivel.)
        
         */
        // Tipo generico ou Generic type
        // Diamond operator <> (Operador Diamante)
        List<String> nomes = new ArrayList();

        // Não funciona tentar colocar números em uma lista com operador String.
        // Exemplo nomes.add(18); (Não vai fuincionar!).
        nomes.add("Matheus");    // 0
        nomes.add("Victor");     // 1
        nomes.add("Guilherme");  // 2
        nomes.add("Daniel");     // 3

        for (int i = 0; i < nomes.size(); i++) {

            System.out.println("Nome: " + nomes.get(i));
            System.out.println("");

        }

        System.out.println("-".repeat(25));
        System.out.println("Depois do add com Index");
        System.out.println("-".repeat(25));

        System.out.println("");

        nomes.add(0, "Pedro");

        for (int i = 0; i < nomes.size(); i++) {

            System.out.println("Nome: " + nomes.get(i));
            System.out.println("");

        }

        System.out.println("-".repeat(25));
        System.out.println("Depois do set");
        System.out.println("-".repeat(25));
        System.out.println("");

        nomes.set(0, "Oswaldo");

        for (int i = 0; i < nomes.size(); i++) {

            System.out.println("Nome: " + nomes.get(i));
            System.out.println("");

        }

        System.out.println("-".repeat(25));
        System.out.println("Depois do remove");
        System.out.println("-".repeat(25));
        System.out.println("");

        // Objeto
//        Integer numero = 1;
        int numero = 0;

        nomes.remove(numero);

        for (int i = 0; i < nomes.size(); i++) {

            System.out.println("Nome: " + nomes.get(i));
            System.out.println("");

        }

        System.out.println("-".repeat(25));
        System.out.println("Depois do clear");
        System.out.println("-".repeat(25));
        System.out.println("");

        nomes.clear();
        
        System.out.println("Tamanho: " + nomes.size());
        
        System.out.println("-".repeat(40));
        System.out.println("Validando se a Lista está vazia ou não.");
        System.out.println("-".repeat(40));
        System.out.println("");
        
        if(nomes.isEmpty()) {
        
            System.out.println("Está vazia...");
            System.out.println("");
            
        }else{
        
            System.out.println("Não está vazia!");
            System.out.println("");
            
        }
        
    }

}
