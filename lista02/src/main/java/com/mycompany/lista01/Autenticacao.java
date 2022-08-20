package com.mycompany.lista01;

import java.util.Scanner;

public class Autenticacao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        while(true) {
            
            System.out.println("Digite seu Usuário: ");
            String user = leitor.nextLine();
            
            System.out.println("Digite sua senha: ");
            String senha = leitor.nextLine();
            
            if(user.equals("admin") && senha.equals("#SPtech2022")) {
                System.out.println("Logado com sucesso!");
                break;
            } else {
                System.out.println("Login invalido, usuário e/ou senha invalidos.");
            }
            
        }
        
    }
}
