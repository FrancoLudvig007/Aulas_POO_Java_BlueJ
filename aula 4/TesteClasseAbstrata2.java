public class TesteClasseAbstrata2 {
    public static void main(String[] args) {
        // Não podemos instanciar a classe Animal diretamente
        // Animal animal = new Animal("Animal", 5); // Erro!
        
        Cachorro cachorro = new Cachorro("Rex", 3, "Labrador");
        Passaro passaro = new Passaro("Piu", 1, "Canário");
        
        System.out.println("=== Teste Classe Abstrata ===");
        
        System.out.println("\n--- Cachorro ---");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Idade: " + cachorro.getIdade());
        System.out.println("Raça: " + cachorro.getRaca());
        cachorro.emitirSom();
        cachorro.mover();
        cachorro.dormir();
        
        System.out.println("\n--- Pássaro ---");
        System.out.println("Nome: " + passaro.getNome());
        System.out.println("Idade: " + passaro.getIdade());
        System.out.println("Espécie: " + passaro.getEspecie());
        passaro.emitirSom();
        passaro.mover();
        passaro.dormir();
        
        System.out.println("\n=== Polimorfismo com Classe Abstrata ===");
        Animal[] animais = {cachorro, passaro};
        
        for (Animal animal : animais) {
            System.out.println("\nAnimal: " + animal.getNome());
            animal.emitirSom();
            animal.mover();
        }
    }
}