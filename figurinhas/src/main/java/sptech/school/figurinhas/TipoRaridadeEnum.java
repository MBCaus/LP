package sptech.school.figurinhas;

public enum TipoRaridadeEnum {

    LENDARIA("Lendaria", 50.00),
    MITICA("Mítica", 40.00),
    RARA("Rara", 30.00),
    COMUM("Comum", 20.00);
    
    private String nome;
    private Double precoRevenda;

    private TipoRaridadeEnum(String nome, Double precoRevenda) {
        this.nome = nome;
        this.precoRevenda = precoRevenda;
    }
    
    public static TipoRaridadeEnum sortearRaridade() {
    
        return null;
    
    }

    public String getNome() {
        return nome;
    }

    public Double getPrecoRevenda() {
        return precoRevenda;
    }
    
}
