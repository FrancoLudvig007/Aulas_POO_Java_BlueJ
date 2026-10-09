public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    private String email;
    
    // Construtor padrão
    public Pessoa() {
        this.nome = "Não informado";
        this.idade = 0;
        this.endereco = "Não informado";
        this.telefone = "Não informado";
        this.email = "Não informado";
    }
    
    // Construtor com nome
    public Pessoa(String nome) {
        this();
        this.nome = nome;
    }
    
    // Construtor com nome e idade
    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }
    
    // Construtor com nome, idade e endereço
    public Pessoa(String nome, int idade, String endereco) {
        this(nome, idade);
        this.endereco = endereco;
    }
    
    // Construtor completo
    public Pessoa(String nome, int idade, String endereco, String telefone, String email) {
        this(nome, idade, endereco);
        this.telefone = telefone;
        this.email = email;
    }
    
    // Sobrecarga de métodos
    public void atualizarInformacoes(String nome) {
        this.nome = nome;
    }
    
    public void atualizarInformacoes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void atualizarInformacoes(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getEmail() {
        return email;
    }
}