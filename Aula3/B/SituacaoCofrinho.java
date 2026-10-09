public class SituacaoCofrinho {
    public void exibirStatus(Cofrinho cofrinho) 
    {
        System.out.println("\n--- SITUACAO DO COFRINHO ---");
        System.out.println("Dono: " + cofrinho.getDono().getNome());
        System.out.println("Saldo atual: R$ " + cofrinho.getSaldo());

        if (cofrinho.getSaldo() == 0) 
        {
            System.out.println("Estado: Vazio");
        } 
        else if (cofrinho.getSaldo() < 50) 
        {
            System.out.println("Estado: Pouco dinheiro");
        } 
        else 
        {
            System.out.println("Estado: Cheio");
        }
    }
}