public class Imovel
{
    String endereco;
    double area;
    double preco;
    boolean vendido;

    public Imovel(String endereco, double area, double preco)
    {
        this.endereco = endereco;
        this.area = area;
        this.preco = preco;
        this.vendido = false;
    }

    public void vender()
    {
        vendido = true;
        System.out.println("Imóvel vendido.");
    }

    public void alterarPreco(double novoPreco)
    {
        preco = novoPreco;
        System.out.println("Novo preço: R$ " + preco);
    }

    public void exibirInformacoes()
    {
        System.out.println("Endereço: " + endereco);
        System.out.println("Área: " + area + " m²");
        System.out.println("Preço: R$ " + preco);
        System.out.println("Vendido: " + vendido);
    }
}