public class ProdutoAlimenticio extends Produto {
    private String dataValidade;
    private boolean isOrganico;
    
    public ProdutoAlimenticio(String nome, double preco, String codigo, String dataValidade) {
        super(nome, preco, codigo);
        this.dataValidade = dataValidade;
        this.isOrganico = false;
    }
    
    public String getDataValidade() {
        return dataValidade;
    }
    
    public boolean isOrganico() {
        return isOrganico;
    }
    
    public void setOrganico(boolean organico) {
        isOrganico = organico;
    }
    
    @Override
    public double calcularPrecoFinal() {
        if (isOrganico) {
            return preco * 1.10; // 10% mais caro se for orgânico
        }
        return preco;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Produto Alimentício ===");
        super.exibirInformacoes();
        System.out.println("Validade: " + dataValidade);
        System.out.println("Orgânico: " + (isOrganico ? "Sim" : "Não"));
    }
}