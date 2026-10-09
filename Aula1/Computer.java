
/**
 * Representa um computador com informações básicas
 * sobre marca, modelo, processador, memória RAM e clock.
 *
 * @author Franco
 * @version 1.0
 */
public class Computer
{
    private String marca;
    private String modelo;
    private String cpuName;
    private float RAM;
    private float clock;

    // Construtor
    public Computer(String processador, String marca, String modelo,
                    float clock, float RAM)
    {
        this.cpuName = processador;
        this.marca = marca;
        this.modelo = modelo;
        this.clock = clock;
        this.RAM = RAM;
    }

    // Getter da marca
    public String getMarca()
    {
        return marca;
    }

    // Setter da marca
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    // Getter do modelo
    public String getModelo()
    {
        return modelo;
    }

    // Setter do modelo
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    // Getter do processador
    public String getCpuName()
    {
        return cpuName;
    }

    // Setter do processador
    public void setCpuName(String cpuName)
    {
        this.cpuName = cpuName;
    }

    // Getter da memória RAM
    public float getRAM()
    {
        return RAM;
    }

    // Setter da memória RAM
    public void setRAM(float RAM)
    {
        this.RAM = RAM;
    }

    // Getter do clock
    public float getClock()
    {
        return clock;
    }

    // Setter do clock
    public void setClock(float clock)
    {
        this.clock = clock;
    }

    // Exibe as informações do computador
    public void mostrarInformacoes()
    {
        System.out.println("===== COMPUTADOR =====");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador: " + cpuName);
        System.out.println("Clock: " + clock + " GHz");
        System.out.println("Memória RAM: " + RAM + " GB");
    }
}
