public class Cofrinho {
    private double saldo;
    private Pessoa dono;

    public Cofrinho(Pessoa dono) 
    {
        this.dono = dono;
        this.saldo = 0.0;
    }

    public void depositar(double valor) 
    {
        if (valor > 0) 
        {
            this.saldo += valor;
        }
    }

    public boolean retirar(double valor) 
    {
        if (valor > 0 && this.saldo >= valor) 
        {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() 
    {
        return this.saldo;
    }

    public Pessoa getDono() 
    {
        return this.dono;
    }
}