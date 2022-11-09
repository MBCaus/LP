package school.sptech.heranca.com.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {

    private String nome;
    private String vagas;
    private List<Desenvolvedor> desenvolvedores = new ArrayList();

    public Consultoria(String nome, String vagas) {
        this.nome = nome;
        this.vagas = vagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas) {
        this.vagas = vagas;
    }
    
    public Boolean existePorNome(String nome) {
    
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            
            if(desenvolvedor.getNome().equals(nome)) {
            
                return true;
            
            }
            
        }
        return false;
    }
    
    public void contratar(Desenvolvedor desenvolvedor) {
    
        desenvolvedores.add(desenvolvedor);
        
    }
    
    public Integer getQuantidadeDesenvolvedores() {
    
        return desenvolvedores.size();
        
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile() {
    
        Integer desenvolveresMobile = 0;
        
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            
            if(desenvolvedor instanceof DesenvolvedorMobile) {
            
                desenvolveresMobile++;
                
            }
            
        }
        
        return desenvolveresMobile;
        
    }
    
    public Double getTotalSalarios() {
    
        Double totalSalarios = 0.0;
        
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            
            totalSalarios += desenvolvedor.getSalario();
            
        }
        
        return totalSalarios;
        
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome) {
    
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            
            if(desenvolvedor.getNome().equals(nome)) {
            
                return desenvolvedor;
            
            }
            
        }
        return null;
    }

    @Override
    public String toString() {
        
        String textoConsultoria = String.format(
        "Nome da consultoria: %s \n"
      + "Vaga disponivel: %s \n",
        this.nome, this.vagas);
        
        return textoConsultoria;
    }
    
    
    
}
