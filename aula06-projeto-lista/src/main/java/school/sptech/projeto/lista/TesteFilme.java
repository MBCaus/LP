package school.sptech.projeto.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteFilme {

    public static void main(String[] args) {
        
        Filme filme1 = new Filme("Titanic", 1996, "James Cameron");
        
        System.out.println("Nome: " + filme1.getNome());
        System.out.println("Nome: " + filme1.getAno());
        System.out.println("Nome: " + filme1.getDiretor());

//        Scanner leitor = new Scanner(System.in);
//        
//        List<Filme> filmes = new ArrayList();
//        
//        while(true){
//        
//            System.out.println("Digite o nome de um Filme: ");
//            String nome = leitor.nextLine();
//            
//            System.out.println("Digite o ano do Filme: ");
//            Integer ano = leitor.nextInt();
//            
//            System.out.println("Digite o nome do Diretor: ");
//            String diretor = leitor.nextLine();
//        
//        }

        System.out.println(filme1);
        
    }

}
