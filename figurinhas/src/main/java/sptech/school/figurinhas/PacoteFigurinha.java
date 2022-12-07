package sptech.school.figurinhas;

import java.util.List;

public class PacoteFigurinha {

    private Boolean aberto;
    private Integer quantidadeDeFigurinhas;
    private List<Figurinha> figurinhas;

    public PacoteFigurinha(Boolean aberto, Integer quantidadeDeFigurinhas, List<Figurinha> figurinhas) {
        this.aberto = aberto;
        this.quantidadeDeFigurinhas = quantidadeDeFigurinhas;
        this.figurinhas = figurinhas;
    }
    
    public static List<Figurinha> abrirPacote() {
    
        return null;
    
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Integer getQuantidadeDeFigurinhas() {
        return quantidadeDeFigurinhas;
    }

    public void setQuantidadeDeFigurinhas(Integer quantidadeDeFigurinhas) {
        this.quantidadeDeFigurinhas = quantidadeDeFigurinhas;
    }

    public List<Figurinha> getFigurinhas() {
        return figurinhas;
    }

    public void setFigurinhas(List<Figurinha> figurinhas) {
        this.figurinhas = figurinhas;
    }
    
}
