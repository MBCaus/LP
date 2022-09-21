package school.sptech.projeto.lista;

public class ExemploVetor {

    public static void main(String[] args) {
        
        String[] nomes = new String[3];
        
        nomes[0] = "Matheus";
        nomes[1] = "Victor";
        nomes[2] = "Guilherme";
        
        for (int i = 0; i < nomes.length; i++) {
            
            System.out.println("Nome: " + nomes[i]);
            
        }
        
    }
    
}
