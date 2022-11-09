package school.sptech.heranca.com.agregacao;

public class App {

    public static void main(String[] args) {
        
        Desenvolvedor dev1 = new Desenvolvedor("Gabriel", 22, 800.0);
        Desenvolvedor dev2 = new Desenvolvedor("Pedro", 10, 800.0);
        Desenvolvedor dev3 = new Desenvolvedor("João", 35, 800.0);
        
        DesenvolvedorMobile devMob1 = new DesenvolvedorMobile("Miguel",
                5, 800.0, 15, 1_000.0);
        DesenvolvedorMobile devMob2 = new DesenvolvedorMobile("Alex",
                9, 800.0, 10, 1_000.0);
        DesenvolvedorMobile devMob3 = new DesenvolvedorMobile("Heloisa",
                10, 800.0, 5, 1_000.0);
        
        Consultoria consultoria = new Consultoria("EletroYag", "Desenvolvedor Mobile");
        
        consultoria.contratar(dev2);
        
        System.out.println(consultoria.existePorNome("Pedro"));
        
        System.out.println(consultoria.getQuantidadeDesenvolvedores());
        
        System.out.println(consultoria.getQuantidadeDesenvolvedoresMobile());
        
        System.out.println(consultoria.getTotalSalarios());
        
        consultoria.buscarDesenvolvedorPorNome("Pedro");
        
        
    }
    
}
