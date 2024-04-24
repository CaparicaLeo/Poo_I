public class Retangulo {
    private double altura;
    private double comprimento;
    public Retangulo(double a, double c) {
        this.altura = a;
        this.comprimento = c;
    }
    public Retangulo(){
        this.altura = 1.0;
        this.comprimento = 1.0;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public double calculaPeri(){
        return this.getAltura() + this.getComprimento();
    }
    public void imprimePeri(){
        System.out.println("O perimetro de um retangulo de " + this.getAltura() + " de altura e "
        + this.getComprimento() + " de comprimento eh: " + this.calculaPeri());
    }
    public double calculaArea(){
        return this.getAltura() * this.getComprimento();
    }
    public void imprimeArea(){
        System.out.println("A area de um retangulo de " + this.getAltura() + " de altura e "
        + this.getComprimento() + " de comprimento eh: " + this.calculaArea());
    }
}
