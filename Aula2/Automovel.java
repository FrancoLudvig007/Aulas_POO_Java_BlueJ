public class Automovel
{
    String marca;
    String modelo;
    int ano;
    double velocidade;

    public Automovel(String marca, String modelo, int ano)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar()
    {
        velocidade = velocidade + 10;
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    public void frear()
    {
        if (velocidade > 0)
        {
            velocidade = velocidade - 10;
        }

        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    public void exibirInformacoes()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}