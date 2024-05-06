public class Triangulo extends TwoDShape{
    private String estilo;

    public double area(){
        return (this.getAltura() * this.getLargura())/2;
    }
    public void mostraEstilo(){
        System.out.println("Triangulo = "+ this.estilo);
    }
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
