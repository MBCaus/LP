package sptech.school.diagramas.testes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.mycompany.exercicio.b.*;

public class FaculdadeTestes {

    private Faculdade faculdade;
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;
    private Aluno aluno4;

    @BeforeEach
    public void init() {
        this.aluno1 = new Aluno("021", "Victor Zanin", 2);
        this.aluno2 = new Aluno("022", "Matheus Barizon", 2);
        this.aluno3 = new Aluno("024", "Paulo Dias", 1);
        this.aluno4 = new Aluno("025", "Julia Martins", 4);
        this.faculdade = new Faculdade("SPTech");
    }

    @Test
    @DisplayName("")
    void exibindoOsAlunos() {
        this.faculdade.matricularAluno(aluno1);
        this.faculdade.matricularAluno(aluno2);
        this.faculdade.matricularAluno(aluno3);
        System.out.println("exibindoOsAlunos()");

        this.faculdade.exibirAlunos();
        System.out.println("-".repeat(15));
    }

    @Test
    @DisplayName("")
    void exibindoOsAlunosPorSemestre() {
        this.faculdade.matricularAluno(aluno1);
        this.faculdade.matricularAluno(aluno2);
        this.faculdade.matricularAluno(aluno3);
        this.faculdade.matricularAluno(aluno4);
        System.out.println("exibindoOsAlunosPorSemestre()");
        this.faculdade.exibirAlunosPorSemestre(2);
        System.out.println("-".repeat(15));
    }

    @Test
    @DisplayName("")
    void exibirAlunosCancelados() {
        this.faculdade.matricularAluno(aluno1);
        this.faculdade.matricularAluno(aluno2);
        this.faculdade.matricularAluno(aluno3);

        this.faculdade.cancelarMatricula("021");

        System.out.println("exibirAlunosCancelados()");

        this.faculdade.exibirCancelados();
    }
}
