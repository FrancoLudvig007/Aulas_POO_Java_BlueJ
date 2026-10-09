public class TesteClasseAbstrata {
    public static void main(String[] args) {
        // Não podemos instanciar FormaGeometrica diretamente
        // FormaGeometrica forma = new FormaGeometrica("Azul"); // Erro!
        
        Circulo circulo = new Circulo("Vermelho", 5.0);
        Retangulo retangulo = new Retangulo("Azul", 4.0, 6.0);
        
        System.out.println("--- Círculo ---");
        System.out.println("Cor: " + circulo.getCor());
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        
        System.out.println("\n--- Retângulo ---");
        System.out.println("Cor: " + retangulo.getCor());
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}