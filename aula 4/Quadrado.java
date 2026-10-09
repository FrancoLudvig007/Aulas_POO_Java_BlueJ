public class Quadrado extends Forma {
    private double lado;
    
    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    @Override
    public void desenhar() {
        System.out.println("Desenhando um quadrado de lado " + lado);
    }
    
    public double getLado() {
        return lado;
    }
}