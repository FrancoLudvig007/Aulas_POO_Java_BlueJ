public class Moto extends Veiculo {
    private boolean temPartidaEletrica;
    
    public Moto(String marca, String modelo, boolean temPartidaEletrica) {
        super(marca, modelo);
        this.temPartidaEletrica = temPartidaEletrica;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Informações da Moto ===");
        super.exibirInformacoes();
        System.out.println("Partida elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
    }
    
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando velozmente!");
    }
}