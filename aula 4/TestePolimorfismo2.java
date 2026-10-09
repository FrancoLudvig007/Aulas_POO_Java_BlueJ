public class TestePolimorfismo2 {
    public static void main(String[] args) {
        Forma[] formas = new Forma[3];
        formas[0] = new Forma("Forma Genérica");
        formas[1] = new Quadrado(5.0);
        formas[2] = new Triangulo(4.0, 6.0);
        
        System.out.println("=== Demonstração de Polimorfismo ===");
        
        for (Forma forma : formas) {
            System.out.println("\n--- " + forma.getNome() + " ---");
            forma.desenhar();
            System.out.println("Área: " + forma.calcularArea());
        }
        
        System.out.println("\n=== Array de Formas ===");
        Forma[] formas2 = {
            new Quadrado(3.0),
            new Triangulo(5.0, 8.0),
            new Quadrado(7.0),
            new Triangulo(6.0, 4.0)
        };
        
        for (Forma forma : formas2) {
            System.out.println(forma.getNome() + " - Área: " + forma.calcularArea());
        }
    }
}