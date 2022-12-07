package sptech.school.pedido;

public enum Lanche {

    XBACON(1, "X-Bacon", 30.00),
    XBURGUER(2, "X-Burguer", 20.00),
    XEGG(3, "X-Egg", 15.00),
    XSALADA(4, "X-Salada", 17.50);
    
    private Integer id;
    private String nome;
    private Double preco;

    private Lanche(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public static void mostrarOpcoes() {
    
        for (Lanche lanches : Lanche.values()) {
            System.out.println("Id: " + lanches.getId() + 
                    "\nNome: " + lanches.getNome() + "\nPreço: " + lanches.getPreco() + "\n");
        }
        
    }
    
    public static Lanche buscarPorId(Integer id) {
    
        for (int i = 0; i < Lanche.values().length; i++) {
            if(Lanche.values()[i].getId().equals(id)) {
                return  Lanche.values()[i];
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
