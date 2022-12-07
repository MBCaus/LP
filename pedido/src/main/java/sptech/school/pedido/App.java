package sptech.school.pedido;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        System.out.println("Monte seu Combo: \n");
        
        Lanche.mostrarOpcoes();
        System.out.println("Digite o número ID para escolher: \n");
        Integer id1 = leitor.nextInt();
        Lanche lanche = Lanche.buscarPorId(id1);

        Bebida.mostrarOpcoes();
        System.out.println("Digite o número ID para escolher: \n");
        Integer id2 = leitor.nextInt();
        Bebida bebida = Bebida.buscarPorId(id2);

        Acompanhamento.mostrarOpcoes();
        System.out.println("Digite o número ID para escolher: \n");
        Integer id3 = leitor.nextInt();
        Acompanhamento acompanhamento = Acompanhamento.buscarPorId(id3);
        
        Pedido pedido = new Pedido();
        
        System.out.println(pedido.getTotal(lanche, bebida, acompanhamento));

    }

}
