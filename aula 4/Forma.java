public class Forma {
    protected String nome;
    
    public Forma(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double calcularArea() {
        return 0;
    }
    
    public void desenhar() {
        System.out.println("Desenhando " + nome);
    }
}