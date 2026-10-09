public class TesteEncapsulamento {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", "12345-6");
        
        // Tentando acessar diretamente os atributos privados
        // conta.saldo = 1000; // Erro! Atributo privado
        // conta.titular = "Maria"; // Erro! Atributo privado
        
        // Usando os métodos públicos para acessar os dados
        conta.exibirInformacoes();
        
        System.out.println("\n--- Operações ---");
        conta.depositar(1000.0);
        conta.sacar(300.0);
        conta.depositar(-50.0); // Tentativa de depósito inválido
        conta.sacar(2000.0); // Tentativa de saque acima do saldo
        
        System.out.println("\n--- Saldo Atualizado ---");
        conta.exibirInformacoes();
    }
}