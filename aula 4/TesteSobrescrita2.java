public class TesteSobrescrita2 {
    public static void main(String[] args) {
        Produto produtoSimples = new Produto("Caneta", 2.50, "CAN001");
        
        ProdutoEletronico smartphone = new ProdutoEletronico("Smartphone", 2000.0, "ELE001", 12);
        
        ProdutoAlimenticio maca = new ProdutoAlimenticio("Maçã", 5.0, "ALI001", "30/12/2024");
        maca.setOrganico(true);
        
        System.out.println("=== Teste de Sobrescrita ===");
        
        produtoSimples.exibirInformacoes();
        System.out.println();
        
        smartphone.exibirInformacoes();
        System.out.println();
        
        maca.exibirInformacoes();
        
        System.out.println("\n=== Comparação de Preços ===");
        System.out.println("Produto simples: R$" + produtoSimples.calcularPrecoFinal());
        System.out.println("Smartphone: R$" + smartphone.calcularPrecoFinal());
        System.out.println("Maçã orgânica: R$" + maca.calcularPrecoFinal());
    }
}