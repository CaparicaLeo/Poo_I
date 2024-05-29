import java.lang.Math;
public class Quadrado extends Figura{

    @Override
    public double area(double lado) {
        return Math.pow(lado,2);
    }
}
