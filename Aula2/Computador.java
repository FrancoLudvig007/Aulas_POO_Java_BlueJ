public class Computador
{
    String marca;
    String modelo;
    int memoriaRAM;
    double preco;

    public Computador(String marca, String modelo, int memoriaRAM, double preco)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.preco = preco;
    }

    public void ligar()
    {
        System.out.println("O computador está ligado.");
    }

    public void desligar()
    {
        System.out.println("O computador está desligado.");
    }

    public void exibirInformacoes()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
        System.out.println("Preço: R$ " + preco);
    }
}