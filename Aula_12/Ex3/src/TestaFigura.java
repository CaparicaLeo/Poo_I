public class TestaFigura{
    public static void main(String[] args) {
        Figura f1 = new Figura();
        Quadrado q1 = new Quadrado();
        Circulo c1 = new Circulo();

        System.out.println(f1.area(34));
        System.out.println(q1.area(5));
        System.out.println(c1.area(8));
    }
}