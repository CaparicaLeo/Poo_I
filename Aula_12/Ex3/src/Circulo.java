public class Circulo extends Figura{

    @Override
    public double area(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}
