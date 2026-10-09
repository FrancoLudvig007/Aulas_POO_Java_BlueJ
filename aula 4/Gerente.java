public class Gerente extends Funcionario {
    private int numeroEquipe;
    private String departamento;
    
    public Gerente(String nome, String cpf, double salario, String departamento) {
        super(nome, cpf, salario);
        this.departamento = departamento;
        this.numeroEquipe = 0;
    }
    
    public int getNumeroEquipe() {
        return numeroEquipe;
    }
    
    public void setNumeroEquipe(int numeroEquipe) {
        this.numeroEquipe = numeroEquipe;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public double calcularBonificacao() {
        return salario * 0.20;
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Departamento: " + departamento);
        System.out.println("Equipe: " + numeroEquipe + " pessoas");
    }
}