public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;
    private String nivel;
    
    public Desenvolvedor(String nome, String cpf, double salario, String linguagemPrincipal) {
        super(nome, cpf, salario);
        this.linguagemPrincipal = linguagemPrincipal;
        this.nivel = "Júnior";
    }
    
    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }
    
    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }
    
    public String getNivel() {
        return nivel;
    }
    
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    @Override
    public double calcularBonificacao() {
        return salario * 0.15;
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Linguagem: " + linguagemPrincipal);
        System.out.println("Nível: " + nivel);
    }
}