public class Veiculo {
    protected String marca;
    protected String modelo;
    
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    
    public void acelerar() {
        System.out.println("O veículo está acelerando...");
    }
}