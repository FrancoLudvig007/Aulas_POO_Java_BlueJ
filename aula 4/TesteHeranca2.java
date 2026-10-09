public class TesteHeranca2 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Carlos Silva", "111.222.333-44", 3000.0);
        Gerente gerente1 = new Gerente("Ana Santos", "555.666.777-88", 8000.0, "TI");
        gerente1.setNumeroEquipe(10);
        Desenvolvedor dev1 = new Desenvolvedor("Pedro Costa", "999.888.777-66", 5000.0, "Java");
        dev1.setNivel("Sênior");
        
        System.out.println("=== Funcionário Comum ===");
        func1.exibirDados();
        
        System.out.println("\n=== Gerente ===");
        gerente1.exibirDados();
        
        System.out.println("\n=== Desenvolvedor ===");
        dev1.exibirDados();
        
        System.out.println("\n=== Demonstração de Herança ===");
        System.out.println("Bonificação do Funcionário: R$" + func1.calcularBonificacao());
        System.out.println("Bonificação do Gerente: R$" + gerente1.calcularBonificacao());
        System.out.println("Bonificação do Desenvolvedor: R$" + dev1.calcularBonificacao());
    }
}