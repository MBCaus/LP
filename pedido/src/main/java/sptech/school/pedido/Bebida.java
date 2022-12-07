package sptech.school.pedido;

public enum Bebida {

    REFRIGERANTE(1, "Refrigerante", 5.00),
    AGUA(2, "Água", 1.00),
    LEITE(3, "Leite", 2.50),
    SUCO_LARANJA(4, "Suco de Laranja", 3.00),
    SUCO_UVA(5, "Suco de Uva", 3.0);
    
    private Integer id;
    private String nome;
    private Double preco;

    private Bebida(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    
    public static void mostrarOpcoes() {
    
        for (Bebida bebidas : Bebida.values()) {
            System.out.println("Id: " + bebidas.getId() + 
                    "\nNome: " + bebidas.getNome() + "\nPreço: " + bebidas.getPreco() + "\n");
        }
    
    }
    
    public static Bebida buscarPorId(Integer id) {
    
        for (int i = 0; i < Bebida.values().length; i++) {
            if(Bebida.values()[i].getId().equals(id)) {
                return  Bebida.values()[i];
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
