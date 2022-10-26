package com.mycompany.projeto.eranca;

public class App {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno(2, "Limbo", 0.0, 0.0);
        
        AlunoPos alunoPos = new AlunoPos(1, "Matheus", 10.0, 6.5, 8.0);
        
        Double calcularMediaAlunoPos = alunoPos.calcularMedia();
        
        System.out.println(calcularMediaAlunoPos);
        
    }
    
}
