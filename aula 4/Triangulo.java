public class Triangulo extends Forma {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        super("Triângulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    @Override
    public void desenhar() {
        System.out.println("Desenhando um triângulo de base " + base + " e altura " + altura);
    }
}