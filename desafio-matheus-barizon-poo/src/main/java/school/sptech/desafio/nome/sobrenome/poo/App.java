package school.sptech.desafio.nome.sobrenome.poo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        RecursosHumanos recursosHumanos = new RecursosHumanos(0, 0);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("-".repeat(30));

        System.out.println("Digite seu cargo: ");
        String cargo = leitor.nextLine();

        System.out.println("-".repeat(30));

        System.out.println("Digite seu salário: ");
        Double salario = leitor.nextDouble();

        System.out.println("-".repeat(30));

        Colaborador colaborador = new Colaborador(nome, cargo, salario);

        colaborador.reajustarSalario(nome, 0.1);

        System.out.println("-".repeat(30));

        String novoCargo = leitor.nextLine();
        System.out.println("Digite seu NOVO cargo: ");
        novoCargo = leitor.nextLine();
        
        System.out.println("-".repeat(30));

        System.out.println("Digite seu NOVO salário: ");
        Double novoSalaraio = leitor.nextDouble();

        System.out.println("-".repeat(30));

        colaborador.promoverColaborador(nome, novoCargo, novoSalaraio);

    }

}
