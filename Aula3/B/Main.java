public class Main {
    public static void main(String[] args) 
    {
        Teclado teclado = new Teclado();
        SituacaoCofrinho situacao = new SituacaoCofrinho();

        String nome = teclado.lerTexto("Digite o nome do dono do cofrinho: ");
        Pessoa pessoa = new Pessoa(nome);
        Cofrinho cofrinho = new Cofrinho(pessoa);

        situacao.exibirStatus(cofrinho);

        double valorDeposito = teclado.lerDouble("\nDigite o valor para depositar: ");
        cofrinho.depositar(valorDeposito);

        situacao.exibirStatus(cofrinho);

        double valorRetirada = teclado.lerDouble("\nDigite o valor para retirar: ");
        if (cofrinho.retirar(valorRetirada)) 
        {
            System.out.println("Saque realizado com sucesso!");
        } 
        else 
        {
            System.out.println("Falha no saque. Saldo insuficiente ou valor invalido.");
        }

        situacao.exibirStatus(cofrinho);

        teclado.fechar();
    }
}