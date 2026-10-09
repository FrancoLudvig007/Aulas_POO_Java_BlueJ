public class Carro implements Veiculo {
    private String modelo;
    private int velocidade;
    
    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
    }
    
    @Override
    public void acelerar() {
        velocidade += 20;
        System.out.println(modelo + " acelerando... Velocidade: " + velocidade + " km/h");
    }
    
    @Override
    public void frear() {
        if (velocidade > 0) {
            velocidade -= 10;
            System.out.println(modelo + " freando... Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println(modelo + " já está parado!");
        }
    }
    
    @Override
    public String getTipo() {
        return "Carro";
    }
}