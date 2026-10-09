public class Cachorro extends Animal {
    private String raca;
    
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }
    
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public void emitirSom() {
        System.out.println(nome + " late: Au Au!");
    }
    
    @Override
    public void mover() {
        System.out.println(nome + " está correndo!");
    }
}