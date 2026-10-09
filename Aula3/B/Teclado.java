import java.util.Scanner;

public class Teclado {
    private Scanner scanner;

    public Teclado() 
    {
        this.scanner = new Scanner(System.in);
    }

    public String lerTexto(String mensagem) 
    {
        System.out.print(mensagem);
        return this.scanner.nextLine();
    }

    public double lerDouble(String mensagem) 
    {
        System.out.print(mensagem);
        double valor = this.scanner.nextDouble();
        this.scanner.nextLine();
        return valor;
    }

    public void fechar() 
    {
        this.scanner.close();
    }
}