public class Produto {
    protected String nome;
    protected double preco;
    protected String codigo;
    
    public Produto(String nome, double preco, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public double calcularPrecoFinal() {
        return preco;
    }
    
    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço base: R$" + preco);
        System.out.println("Preço final: R$" + calcularPrecoFinal());
    }
}