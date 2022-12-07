package sptech.school.figurinhas;

import com.github.javafaker.Faker;
import java.util.Locale;

public class Figurinha {

    private String nomeJogador;
    private TipoRaridadeEnum raridade;

    public Figurinha(String nomeJogador, TipoRaridadeEnum raridade) {
        this.nomeJogador = Faker.instance(Locale.forLanguageTag("pt-BR")).name().fullName();
        this.raridade = raridade;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public TipoRaridadeEnum getRaridade() {
        return raridade;
    }

}
