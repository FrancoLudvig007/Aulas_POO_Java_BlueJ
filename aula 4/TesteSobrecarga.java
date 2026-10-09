public class TesteSobrecarga {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("=== Teste de Sobrecarga ===");
        System.out.println("Somar 2 inteiros: " + calc.somar(5, 3));
        System.out.println("Somar 3 inteiros: " + calc.somar(5, 3, 2));
        System.out.println("Somar 2 doubles: " + calc.somar(5.5, 3.2));
        System.out.println("Concatenar strings: " + calc.somar("Olá, ", "Mundo!"));
        
        System.out.println("\nMultiplicar 2 inteiros: " + calc.multiplicar(5, 3));
        System.out.println("Multiplicar 3 inteiros: " + calc.multiplicar(5, 3, 2));
        System.out.println("Multiplicar 2 doubles: " + calc.multiplicar(5.5, 3.2));
    }
}