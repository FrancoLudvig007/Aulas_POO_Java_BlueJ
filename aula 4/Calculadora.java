public class Calculadora {
    
    // Sobrecarga do método somar
    public int somar(int a, int b) {
        return a + b;
    }
    
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    public double somar(double a, double b) {
        return a + b;
    }
    
    public String somar(String a, String b) {
        return a + b;
    }
    
    // Sobrecarga do método multiplicar
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }
    
    public double multiplicar(double a, double b) {
        return a * b;
    }
}