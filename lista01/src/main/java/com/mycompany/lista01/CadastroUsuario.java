package com.mycompany.lista01;

import java.util.Scanner;

public class CadastroUsuario {
  
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite seu Login: ");
        String login = leitor.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senha = leitor.nextLine();
        
        System.out.println("Qantos erros de senha será permitido? ");
        String erros = leitor.nextLine();
        
        System.out.printf("Seu login é: %s \nSua senha é: %s "
                + "\nVocê tem %s tentativas antes de ser bloqueado"
                , login, senha, erros);
        
    }
    
}
