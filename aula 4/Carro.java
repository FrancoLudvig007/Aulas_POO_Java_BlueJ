public class Carro extends Veiculo {
    private int numeroPortas;
    
    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Informações do Carro ===");
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
    }
    
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando rapidamente!");
    }
}