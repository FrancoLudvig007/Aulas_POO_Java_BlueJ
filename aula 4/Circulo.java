public class Circulo extends FormaGeometrica {
    private double raio;
    
    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
}