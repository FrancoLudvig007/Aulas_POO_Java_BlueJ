public class Bicicleta implements Veiculo {
    private String modelo;
    private int velocidade;
    
    public Bicicleta(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
    }
    
    @Override
    public void acelerar() {
        velocidade += 5;
        System.out.println(modelo + " pedalando... Velocidade: " + velocidade + " km/h");
    }
    
    @Override
    public void frear() {
        if (velocidade > 0) {
            velocidade -= 3;
            System.out.println(modelo + " freando... Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println(modelo + " já está parada!");
        }
    }
    
    @Override
    public String getTipo() {
        return "Bicicleta";
    }
}