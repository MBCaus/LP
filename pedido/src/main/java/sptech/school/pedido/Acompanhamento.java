package sptech.school.pedido;

public enum Acompanhamento {

    BATATA_FRITA(1, "Batata Frita", 13.50),
    SALADA(2, "Salada", 5.50),
    TORTA(3, "Torta", 7.00);
    
    private Integer id;
    private String nome;
    private Double preco;

    private Acompanhamento(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    
    public static void mostrarOpcoes() {
    
        for (Acompanhamento acompanhamentos : Acompanhamento.values()) {
            System.out.println("Id: " + acompanhamentos.getId() + 
                    "\nNome: " + acompanhamentos.getNome() + "\nPreço: " + acompanhamentos.getPreco() + "\n");
        }
    
    }
    
    public static Acompanhamento buscarPorId(Integer id) {
    
        for (int i = 0; i < Acompanhamento.values().length; i++) {
            if(Acompanhamento.values()[i].getId().equals(id)) {
                return  Acompanhamento.values()[i];
            }
        }
        throw new IllegalArgumentException("O Indentificador: " + id + " Não existe.");
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
    
}
