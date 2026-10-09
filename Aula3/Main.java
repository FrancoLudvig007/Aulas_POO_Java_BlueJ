import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        String nomePessoa;
        char primeiraLetraNome;
        int idade;
        float altura;

        System.out.print("Digite o nome da pessoa: ");
        nomePessoa = leitor.nextLine();

        primeiraLetraNome = nomePessoa.charAt(0);

        System.out.print("Digite a idade: ");
        idade = leitor.nextInt();

        System.out.print("Digite a altura (em metros): ");
        altura = leitor.nextFloat();

        System.out.println("\n--- DADOS DO VISITANTE ---");
        System.out.println("Nome: " + nomePessoa);
        System.out.println("Inicial: " + primeiraLetraNome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");

        if (idade >= 12 && altura >= 1.40f) 
        {
            System.out.println("Status: Entrada permitida nos brinquedos!");
        } 
        else 
        {
            System.out.println("Status: Entrada nao permitida.");
        }

        leitor.close();
    }
}