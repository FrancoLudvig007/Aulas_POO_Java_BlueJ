public class ProdutoEletronico extends Produto {
    private int garantiaMeses;
    private double imposto;
    
    public ProdutoEletronico(String nome, double preco, String codigo, int garantiaMeses) {
        super(nome, preco, codigo);
        this.garantiaMeses = garantiaMeses;
        this.imposto = 0.15; // 15% de imposto
    }
    
    public int getGarantiaMeses() {
        return garantiaMeses;
    }
    
    @Override
    public double calcularPrecoFinal() {
        return preco + (preco * imposto);
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Produto Eletrônico ===");
        super.exibirInformacoes();
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}