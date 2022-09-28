package school.sptech.desafio.nome.sobrenome.poo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        Colaborador cl = new Colaborador("Matheus", "Estagiario", 2500.0);
        RecursosHumanos recursosHumanos = new RecursosHumanos();

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("-".repeat(30));

        System.out.println("Digite seu cargo: ");
        String cargo = leitor.nextLine();

        System.out.println("-".repeat(30));

        System.out.println("Digite seu salário: ");
        Double salario = leitor.nextDouble();

        System.out.println("-".repeat(30));

        RecursosHumanos rh = new RecursosHumanos();

        rh.reajustarSalario(cl, 10.0);

        System.out.println("-".repeat(30));

        String novoCargo = leitor.nextLine();
        System.out.println("Digite seu NOVO cargo: ");
        novoCargo = leitor.nextLine();
        
        System.out.println("-".repeat(30));

        System.out.println("Digite seu NOVO salário: ");
        Double novoSalaraio = leitor.nextDouble();

        System.out.println("-".repeat(30));

        rh.promoverColaborador(cl, novoCargo, novoSalaraio);

    }

}
