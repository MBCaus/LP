package school.sptech.projeto.abstrato;

import java.util.ArrayList;
import java.util.List;

public class TesteAbstrato {

    public static void main(String[] args) {

//        Não funciona!!
//        Aluno alunoLimbo = new Aluno();

        AlunoAds alunoAds = new AlunoAds("001", "Alabama", 7.3, 8.1);

        AlunoCco alunoCco = new AlunoCco("002", "Mequetrefe", 9.5, 6.8);

        Aluno teste = new AlunoAds("003", "Predo", 2.0, 5.3);

        List<Aluno> alunos = new ArrayList();
        
        alunos.add(teste);
        alunos.add(alunoAds);
        alunos.add(alunoCco);
    }

}
