public class TesteSobrecarga2 {
    public static void main(String[] args) {
        System.out.println("=== Teste de Sobrecarga de Construtores ===");
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Maria Silva");
        Pessoa p3 = new Pessoa("João Santos", 25);
        Pessoa p4 = new Pessoa("Ana Oliveira", 30, "Rua das Flores, 123");
        Pessoa p5 = new Pessoa("Carlos Souza", 35, "Av. Principal, 456", "(11) 99999-9999", "carlos@email.com");
        
        System.out.println("\n--- Pessoa 1 (Construtor padrão) ---");
        p1.exibirInformacoes();
        
        System.out.println("\n--- Pessoa 2 (Apenas nome) ---");
        p2.exibirInformacoes();
        
        System.out.println("\n--- Pessoa 3 (Nome e idade) ---");
        p3.exibirInformacoes();
        
        System.out.println("\n--- Pessoa 4 (Nome, idade e endereço) ---");
        p4.exibirInformacoes();
        
        System.out.println("\n--- Pessoa 5 (Todos os dados) ---");
        p5.exibirInformacoes();
        
        System.out.println("\n=== Teste de Sobrecarga de Métodos ===");
        
        Pessoa teste = new Pessoa();
        System.out.println("\n--- Estado Inicial ---");
        teste.exibirInformacoes();
        
        teste.atualizarInformacoes("Novo Nome");
        System.out.println("\n--- Após atualizar apenas nome ---");
        teste.exibirInformacoes();
        
        teste.atualizarInformacoes("Outro Nome", 40);
        System.out.println("\n--- Após atualizar nome e idade ---");
        teste.exibirInformacoes();
        
        teste.atualizarInformacoes("Nome Final", 45, "Nova Rua, 789");
        System.out.println("\n--- Após atualizar nome, idade e endereço ---");
        teste.exibirInformacoes();
    }
}