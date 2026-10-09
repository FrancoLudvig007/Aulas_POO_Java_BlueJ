public abstract class FormaGeometrica {
    protected String cor;
    
    public FormaGeometrica(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    // Método abstrato - deve ser implementado pelas subclasses
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();
}