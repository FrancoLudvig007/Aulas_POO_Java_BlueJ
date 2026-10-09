public class TesteInterface {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fusca");
        Veiculo bicicleta = new Bicicleta("Caloi");
        
        System.out.println("=== Teste de Interface ===");
        System.out.println("Tipo do primeiro veículo: " + carro.getTipo());
        carro.acelerar();
        carro.acelerar();
        carro.frear();
        
        System.out.println("\nTipo do segundo veículo: " + bicicleta.getTipo());
        bicicleta.acelerar();
        bicicleta.acelerar();
        bicicleta.frear();
        
        System.out.println("\n=== Demonstração de Polimorfismo com Interface ===");
        Veiculo[] veiculos = {carro, bicicleta};
        
        for (Veiculo veiculo : veiculos) {
            System.out.println("Veículo tipo: " + veiculo.getTipo());
            veiculo.acelerar();
        }
    }
}