public class TesteSobrescrita {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CB500", true);
        
        carro.exibirInformacoes();
        carro.acelerar();
        
        System.out.println();
        
        moto.exibirInformacoes();
        moto.acelerar();
    }
}