package com.mycompany.exercicio.b;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos = new ArrayList();

    public Faculdade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAluno() {
        return alunos;
    }

    public void setAluno(List<Aluno> aluno) {
        this.alunos = aluno;
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void cancelarMatricula(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getRa().equals(ra)) {
                alunos.get(i).setAtivo(false);
            }
        }
    }
    
    public void exibirAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i).getNome());
        }
    }
    
    public void exibirAlunosPorSemestre(Integer semestre) {
        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getSemestre().equals(semestre)) {
                System.out.println(alunos.get(i).getNome());
            }
        }
    }
    
    public void exibirCancelados() {
        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getAtivo() != true) {
                System.out.println(alunos.get(i).getNome());
            }
        }
    }
    
}
