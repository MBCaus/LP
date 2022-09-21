package school.sptech.projeto.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filme {

    private String nome;
    private Integer ano;
    private String diretor;

    public Filme(String nome, Integer ano, String diretor) {
        this.nome = nome;
        this.ano = ano;
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

//    SOBREESCRITAS: Polimorfismo.
    
//    @Override
//    public String toString() {
//        return "Filmes \n" + "nome: " + nome + "\nano: " + ano + "\ndiretor: " + diretor;
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Filme{");
        sb.append("nome=").append(nome);
        sb.append(", ano=").append(ano);
        sb.append(", diretor=").append(diretor);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
