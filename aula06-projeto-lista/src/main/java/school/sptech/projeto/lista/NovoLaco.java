package school.sptech.projeto.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NovoLaco {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<String> filmes = new ArrayList();

        System.out.println("Digite o nome de um filme 01: ");
        filmes.add(leitor.nextLine());

        // Outro modo do Usuário adicionar diretamente na Lista
        System.out.println("Digite o nome de um filme 02: ");
        String filmeDigitado = leitor.nextLine();
        filmes.add(filmeDigitado);

        // Adição de um filme fixo
        System.out.println("Filme Fixo");
        filmes.add("Titanic");

        System.out.println(filmes);

        // Laço de repetição novo:
        System.out.println("");
        System.out.println("-".repeat(60));
        System.out.println("Percorrendo o Vetor com uma nova estrutura de repetição: ");
        System.out.println("-".repeat(60));
        System.out.println("");

        // For aprimorado ou Enhanced for.
        for (String filme : filmes) {

            System.out.println("Nome: " + filme);
            System.out.println("");

        }

        System.out.println("");
        System.out.println("-".repeat(40));
        System.out.println("Percorrendo o Vetor com forEach: ");
        System.out.println("-".repeat(40));
        System.out.println("");

        // For Each (Parecido ou igual ao Lambda (NÃO DEIXE QUE A MARISE VEJA ISSO!!))
        filmes.forEach(filmeAtual -> {

            System.out.println("Nome: " + filmeAtual);
            System.out.println("");

        });

    }

}
