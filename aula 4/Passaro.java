public class Passaro extends Animal {
    private String especie;
    
    public Passaro(String nome, int idade, String especie) {
        super(nome, idade);
        this.especie = especie;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    @Override
    public void emitirSom() {
        System.out.println(nome + " canta: Piu Piu!");
    }
    
    @Override
    public void mover() {
        System.out.println(nome + " está voando!");
    }
}